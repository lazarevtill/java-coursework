import javax.swing.*;
import java.awt.*;


public class NextShape extends JPanel {

    private Shape shape;

    public NextShape() {
        shape = Shape.getRandomShape();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (shape != null) {
            shape.draw(g, 1, 1, squareWidth(), squareHeight());

        }
    }

    private int squareWidth() {
        return getWidth() / 4;
    }

    private int squareHeight() {
        return getHeight() / 4;
    }

    public Shape getShape() {
        return shape;
    }

    public void generateNewShape() {
        shape = Shape.getRandomShape();
        repaint();
    }

}
