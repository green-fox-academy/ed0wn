import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw at least 3 lines with that function using a loop.

        int[] x1 = {getRandomNumberWithinParameters(0,270),getRandomNumberWithinParameters(0,270),getRandomNumberWithinParameters(0,270)};
        int[] y1 = {getRandomNumberWithinParameters(0,320),getRandomNumberWithinParameters(0,320),getRandomNumberWithinParameters(0,320)};
        horizontal(x1,y1,graphics);

    }
    public static void horizontal(int []x1, int [] y1, Graphics drawLine){
        for (int i = 0; i < x1.length; i++) {
            drawLine.drawLine(x1[i],y1[i],x1[i]+50,y1[i]);
        }
    }
    private static int getRandomNumberWithinParameters(int min, int max) {
        return (int) ((Math.random() * ((max - min) +  1)) + min);
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