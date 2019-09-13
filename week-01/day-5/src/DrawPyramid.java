import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner myObj = new Scanner(System.in);
        System.out.println("Write a number!");
        int b = myObj.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = i; j < b; j++) {
                System.out.print(" ");
            }

            for (int k = i/b -1 ; k < i; k++) {
                System.out.print("*");
            }
            for (int l = i/b ; l < i; l++) {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}

