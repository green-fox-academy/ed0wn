import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner myObj = new Scanner(System.in);
        System.out.println("Write a number!");
        int b = myObj.nextInt();
        for (int i = 1; i <= b/2+1; i++) {
            for (int j = 1; j <= b-i; j++) {
                System.out.print(" ");
            }

           for (int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=(b-1)/2;i>0;i--)
        {
            for(int j=1;j<=b-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
