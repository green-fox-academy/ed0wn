import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x;
        int y;
        int size=30;

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                x=row*WIDTH/size;
                y=column*HEIGHT/size;

                if ((row % 2 == 0) == (column%2 == 0 )) {
                    graphics.setColor(Color.black);
                } else  {
                    graphics.setColor(Color.white);
                }
                graphics.fillRect(x, y, WIDTH/size,HEIGHT/size);
            }




        }
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