import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int x= 160;
        int y= 0;
        graphics.setColor(Color.green);
        for (int i = 0; i < 16 ; i++) {

            graphics.drawLine(x, 160,160, y);
            x+=10;
            y+=10;
        }
        x=160;
        y= 320;
        for (int i = 0; i < 16 ; i++) {

            graphics.drawLine(x, 160,160, y);
            x-=10;
            y-=10;
        }
        x=160;
        y= 0;
        for (int i = 0; i < 16 ; i++) {
            graphics.drawLine(x, 160,160, y);
            x-=10;
            y+=10;
        }
        x=160;
        y= 320;
        for (int i = 0; i < 16 ; i++) {

            graphics.drawLine(160, y,x, 160);
            x+=10;
            y-=10;
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