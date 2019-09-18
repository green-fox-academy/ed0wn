import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int[] width={getRandomNumberWithinParameters(0,320), getRandomNumberWithinParameters(0,320),getRandomNumberWithinParameters(0,320),getRandomNumberWithinParameters(0,320)};
        int[] height={getRandomNumberWithinParameters(0,320), getRandomNumberWithinParameters(0,320),getRandomNumberWithinParameters(0,320),getRandomNumberWithinParameters(0,320)};
        int[] x={getRandomNumberWithinParameters(0,320-width[0]), getRandomNumberWithinParameters(0,320-width[1]),getRandomNumberWithinParameters(0,320-width[2]),getRandomNumberWithinParameters(0,320-width[3])};
        int[] y={getRandomNumberWithinParameters(0,320-height[0]), getRandomNumberWithinParameters(0,320-height[1]),getRandomNumberWithinParameters(0,320-height[2]),getRandomNumberWithinParameters(0,320-height[3])};

        rect(width,height,x,y,graphics);
    }
    public static void rect (int[] width, int[] height,int[] x, int[] y, Graphics draw){
        for (int i = 0; i < width.length; i++) {
            draw.setColor(new Color(getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255),getRandomNumberWithinParameters(0,255)));
            draw.drawRect(x[i],y[i],width[i],height[i]);
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