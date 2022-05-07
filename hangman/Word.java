package hangman;
import java.util.ArrayList;
import java.util.Random;



public class Word {
    public String stitchedWord;
    private String chosenWord;
    private String[] wordList;
    private ArrayList<String> unstitchedLetters = new ArrayList<String>();
    private final String blankSpace = "- ";

    public Word(String[] data) {
        wordList = data;
    }

    public String getWord() {
        return chosenWord;
    }

    public void setWord(String word) {
        this.chosenWord = word;
    }

    private void chooseWord() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(wordList.length);
        setWord(wordList[randomIndex]);
    }

    private void setupUnstitchedLetters() {
        for (int i = 0; i < chosenWord.length(); i++) {
            unstitchedLetters.add(blankSpace);
        }
    }

    public void updateStitchedWord() {
        stitchedWord = "";
        for (int i = 0; i < unstitchedLetters.size(); i++) {
            stitchedWord += unstitchedLetters.get(i);
        }
    }

    public void setupWord() {
        chooseWord();
        setupUnstitchedLetters();
        updateStitchedWord();
    }

    public static void main(String[] args) {
        String[] data = {"apple", "banana", "kiwi"}; 
        Word word = new Word(data);
        word.setupWord();
        System.out.println("Chosen Word: " + word.getWord());
        System.out.println("Guessed letters: " + word.stitchedWord);
    }
}
