import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).


        Color[] mycolors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.cyan, Color.pink};
        int[] size = {300, 250,200,150,120,90,50};

        square(size, mycolors, graphics);
    }

    public static void square(int[] size, Color[] color, Graphics graphics) {
        for (int i = 0; i < color.length; i++) {

            graphics.setColor(color[i]);
            graphics.fillRect(WIDTH / 2 - size[i] / 2, HEIGHT / 2 - size[i] / 2, size[i], size[i]);
        }

    }
    private static int random(int min, int max) {
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