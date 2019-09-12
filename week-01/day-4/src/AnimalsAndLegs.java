import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of chickens");
        int chickens = myObj.nextInt();
        int chickenLegs = chickens*2;
        System.out.println("Enter number of pigs");
        int pigs = myObj.nextInt();
        int pigLegs = pigs*4;

        System.out.println("Number of legs: " + (chickenLegs+pigLegs));

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}