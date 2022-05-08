package hangman;
import java.util.ArrayList;

public class Guess {
    private char letter;
    protected ArrayList<Boolean> correctGuesses = new ArrayList<Boolean>();
    private ArrayList<Boolean> availableLetters = new ArrayList<Boolean>();

    public Guess(String word) {
        for (int i = 0; i < word.length(); i++) {
            correctGuesses.add(false);
        }
        
        for (int i = 0; i < 26; i++) {
            availableLetters.add(true);
        }
    }

    public void setLetter(String letterInput) {
        letter = letterInput.charAt(0);
    } 

    public char getLetter() {
        return letter;
    }

    public boolean checkGuess(String word) {
        // checks if user guess is in the word.
        boolean correct = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                correctGuesses.set(i, true);
                correct = true;
            }
        }
        return correct;
    }

    public boolean isLetterAvailable() {
        // checks if the letter guessed has been guessed already.
        int ascii = (int) letter;
        int indexAvailable = ascii - 97;
        if (availableLetters.get(indexAvailable)) {
            availableLetters.set(indexAvailable, false);
            return true;
        }
        return false;
    }
}
