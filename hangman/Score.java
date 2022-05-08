package hangman;

public class Score {
    public int points;

    public Score() {
        points = 0;
    }

    public void updateScore() {
        points++;
    }

    protected boolean checkGameOver() {
        // returns true if the user has misguessed
        // more than 5 times.
        return (points > 5);
    }
}
