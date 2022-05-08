package hangman;
import java.util.Scanner;

public class InputService {
    public String userInput;
    static final String[] letters = {"a", "b", "c", "d", "e", "f", 
    "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
    "t", "u", "v", "w", "x", "y", "z"};
    DisplayService display = new DisplayService();
    Scanner in = new Scanner(System.in);


    public void input(String message) {
        // displays a message to user and gets input
        display.displayMessage(message);
        userInput = in.nextLine();
        userInput = userInput.toLowerCase();
        
    }

    public boolean checkInput() {
        // confirms user input is valid.
        if (userInput.length() == 1) {
            if (userInput.charAt(0) >= 'a' && userInput.charAt(0) <= 'z') {
                return true;
            }
            return false;
        } else return false;
    }
}
