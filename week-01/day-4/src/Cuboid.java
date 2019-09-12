public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        int length = 12;
        int height = 6;
        int width = 3;

        System.out.println("Surface Area: " + 2* ((width*length) + (width*height) + (length*height)));
        System.out.println("Volume: " + length * width * height);
    }
}
