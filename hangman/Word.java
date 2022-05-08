package hangman;
import java.util.ArrayList;
import java.util.Random;



public class Word {
    public String stitchedWord; // what letters have and haven't been guessed.
    private String chosenWord; 
    private String[] wordList;

    // an array of what letters have and have not been guessed.
    private ArrayList<String> unstitchedLetters = new ArrayList<String>();

    // an array containing the characters of the chosenWord.
    private ArrayList<String> chosenWordArray = new ArrayList<String>();

    private final String blankSpace = "_ ";
    public Guess guess; 

    public Word(String[] wordArray) {
        wordList = wordArray;
    }

    public String getWord() {
        return chosenWord;
    }

    public void setWord(String word) {
        this.chosenWord = word;
    }

    private void chooseWord() {
        // randomly selects word from list.
        Random rand = new Random();
        int randomIndex = rand.nextInt(wordList.length);
        setWord(wordList[randomIndex]);
    }

    private void setupUnstitchedLetters() {
        // sets up the unstitchedLetters array.
        for (int i = 0; i < chosenWord.length(); i++) {
            unstitchedLetters.add(blankSpace);
        }
    }

    private void setupGuess() {
        guess = new Guess(chosenWord);
    }

    private void setupChosenWordArray() {
        // breaks chosenWord into an array
        for (int i = 0; i < chosenWord.length(); i++) {
            String character = String.valueOf(chosenWord.charAt(i));
            chosenWordArray.add(character);
        }
    }

    public void updateStitchedWord() {
        // combines the unstitchedLetters into a string
        stitchedWord = "";
        for (int i = 0; i < unstitchedLetters.size(); i++) {
            stitchedWord += unstitchedLetters.get(i);
        }
    }

    public void updateUnstitchedLetters() {
        // checks from guess object if the user correctly guessed a letter
        for (int i = 0; i < guess.correctGuesses.size(); i++) {
            boolean currentGuess = guess.correctGuesses.get(i);
            if (currentGuess) {
                unstitchedLetters.set(i, chosenWordArray.get(i));
            }
        }
    }

    public boolean checkStitchedWordComplete() {
        // returns true of the user has guessed all the letters
        for (int i = 0; i < unstitchedLetters.size(); i++) {
            if (unstitchedLetters.get(i) == blankSpace) {
                return false;
            }
        }
        return true;
    }

    public void setupWord() {
        // gets the Word object ready.
        chooseWord();
        setupGuess();
        setupChosenWordArray();
        setupUnstitchedLetters();
        updateStitchedWord();
    }
}
