import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics) {
        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        int[] x = {getRandomNumberWithinParameters(0, 320 - 50), getRandomNumberWithinParameters(0, 320 - 50), getRandomNumberWithinParameters(0, 320 - 50)};
        int[] y = {getRandomNumberWithinParameters(0, 320 - 50), getRandomNumberWithinParameters(0, 320 - 50), getRandomNumberWithinParameters(0, 320 - 50)};
        square(x, y, graphics);

    }

    public static void square(int[] x, int[] y, Graphics square) {
        for (int i = 0; i < x.length; i++) {
            square.drawRect(x[i], y[i], 50, 50);
        }
    }

    private static int getRandomNumberWithinParameters(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        mainDraw(graphics);
    }
}

}