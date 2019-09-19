import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x= 0;
        int y= 0;

        for (int i = 0; i <= WIDTH/20*4; i++) {


            if(x<=WIDTH-20 && y==0 && x>=0 ){
                line(x,y,graphics);
                x+=20;
            }
             else if (y<=HEIGHT-20 && x>=WIDTH-20){
                line(x,y,graphics);
                 y+=20;
            }
             else if (y>=HEIGHT-20 && (x>=WIDTH-20 || x>=0+20)){
                line(x,y,graphics);
                 x-=20;
            }

             else if (y<=HEIGHT && y>=0+20 && x==0){
                line(x,y,graphics);
                 y-=20;
            }

        }

//        for (int i : x) {
//            int x1=x[i];
//            x[i]+=20;
//
//            for (int j : y) {
//                int y1 = y[j];
//                y[j]+=20;
//                line(x1, y1, graphics);
//            }
//        }
//        for (int i = 0; i < x.length; i++) {
//            int x1 = x[i];
//            if (x[i] == HEIGHT) {
//                x[i] = 0;
//
//            } else {
//                x[i] += 20;
//            }
//            for (int j = 0; j < y.length + 1; j++) {
//                int y1 = y[j];
//
//                if (y[j] == HEIGHT) {
//                    x[i] += 20;
//                } else {
//                    y[j] += 20;
//                }
//                line(x1, y1, graphics);
//
//            }
//        }
//
//
    }

    public static void line(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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