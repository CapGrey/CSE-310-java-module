package hangman;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // read from file the word list.
        DisplayService display = new DisplayService();
        String file = "hangman\\wordsList.csv";
        String line;
        String[] wordArray = {};
        try(Scanner scanner = new Scanner(new File(file))){

            //Read the next line
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                wordArray = line.split(",");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // set up the game.
        Word word = new Word(wordArray);
        Score score = new Score();
        InputService in = new InputService();
        
        word.setupWord();
        display.convertScoreToSketch(score.points);

        // initiate game loop.
        boolean gameOver = false;
        while (!gameOver) {
            
            // get and confirm user input.
            in.input(word.stitchedWord);
            if(in.checkInput()) {
                word.guess.setLetter(in.userInput);
                if (word.guess.isLetterAvailable()){
                    if (!word.guess.checkGuess(word.getWord())) {
                        score.updateScore();
                    }
                }
                // update the word object.
                word.updateUnstitchedLetters();
                word.updateStitchedWord();
                display.convertScoreToSketch(score.points);

                // check end conditions.
                if (score.points >= 6) {
                    display.displayMessage("Game Over!\n");
                    display.displayMessage("The word was: " + word.getWord());
                    gameOver = true;
                }
                else if(word.checkStitchedWordComplete()) {
                    display.displayMessage(word.stitchedWord + "\n");
                    display.displayMessage("You won!\n");
                    gameOver = true;
                }
            }
            // display message if user enters incorrect characters.
            else {
                display.displayMessage("Make sure to enter a single letter!");
            }

        }
    }
}
