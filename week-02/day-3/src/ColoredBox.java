import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.


        graphics.setColor(new Color(getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255)));
        graphics.drawLine(20,20,20,200);
        graphics.setColor(new Color(getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255)));
        graphics.drawLine(200,200,200,20);
        graphics.setColor(new Color(getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255)));
        graphics.drawLine(20,200,200,200);
        graphics.setColor(new Color(getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255)));
        graphics.drawLine(200,20,20,20);

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