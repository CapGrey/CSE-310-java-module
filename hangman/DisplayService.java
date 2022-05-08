package hangman;

public class DisplayService {
    private String head = " ";
    private String body = " ";
    private String leftHand = " ";
    private String rightHand = " ";
    private String leftFoot = " ";
    private String rightFoot = " ";

    public void convertScoreToSketch(int points) {
        /* cases are in decending order. If their is 
         a case of greater numerical value, all the
         lower cases also need to be executed. */
        switch (points) {
            case 6:
                rightFoot = "\\";
            case 5:
                leftFoot = "/";
            case 4: 
                rightHand = "\\";
            case 3:
                leftHand = "/";
            case 2:
                body = "|";
            case 1:
                head = "o";
        }

        // display the sketch.
        System.out.println(" ------");
        System.out.println(" |    |");
        System.out.println(" " + head +"    |" );
        System.out.println(leftHand + body + rightHand + "   |");
        System.out.println(" " + body + "    |");
        System.out.println(leftFoot + " " + rightFoot + "   |" );
        System.out.println("      |");
        System.out.println(" -------");
        System.out.println(" |     |\n"); 
    }

    public void displayMessage(String message) {
        // displays a message in the terminal.
        System.out.println(message);
    }
}
