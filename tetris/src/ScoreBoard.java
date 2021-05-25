import javax.swing.*;

public class ScoreBoard extends JLabel {
    String[] sentences = {"Cool!", "WOW!", "AS GOD!"};
    private int score;
    private int level;
    public ScoreBoard() {
        super();
        score = 0;
        level = 1;
    }
    public void increment(int points) {
        score += points;
        if (score % 5 == 0) {
            level++;
        }
        setText("Level: " + level + " · Score: " + score);
        if (score >= 10) {
            setText("Level: " + level + " · Score: " + score + " " + getSentence());
        }
    }
    public void reset() {
        score = 0;
        level = 1;
        setText("Level: " + level + " · Score: " + score);
    }
    public void pause() {
        setText("Paused");
    }
    public void resume() {
        setText("Level: " + level + " · Score: " + score);
    }
    public String printScore() {
        return "Score: " + score;
    }
    public int getScore() {
        return score;
    }
    public String getSentence() {
        String s = "";
        int num = (int) (Math.random() * sentences.length);
        s = sentences[num];
        return "" + s;
    }
}
