import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
//        int[] x = {0, 160, 320};
//        int[] y = {320, 145, 320};
//        graphics.setColor(Color.red);
//        graphics.drawPolygon(x, y, 3);
//        int x1=310;
//        int y1=320;
//        int x2=160;
//        int y2=100;
//        for (int i = 0; i < 10; i++) {
//
//
//            graphics.drawLine(x1,y1,x2,y2);
//
//            x1+=10;
//            x2+=10;
//            y2-=15;
//

//        double h= 20/ Math.sqrt(3)/2;
//        System.out.println(h);
        int x1 = 320;
        int y1 = 320;
        int x2 = 320;
        int y2 = 320;
        for (int i = 0; i < 16; i++) {
            x1-=20;
            x2-=10;
            y2-=20;
            graphics.drawLine(x1, y1, x2, y2);


        }
        x1 = 0;
        y1 = 320;
        x2 = 0;
        y2 = 320;
        for (int i = 0; i < 16; i++){
            x1+=20;
            x2+=10;
            y2-=20;
            graphics.drawLine(x1, y1, x2, y2);

        }
        x1 = 0;
        y1 = 320;
        x2 = 320;
        y2 = 320;
        for (int i = 0; i < 16; i++){
            graphics.drawLine(x1, y1, x2, y2);
            x1+=10;
            y1-=20;
            x2-=10;
            y2-=20;
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
