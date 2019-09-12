public class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        String name = "Gabor";
        int age = 28;
        double height = 1.88;
        boolean married = false;

        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My height is: " + height + " m.");

        if (married) {
            System.out.println("Happily married");
        }
        else {
            System.out.println("No marriage, no worries.");
        }
    }
}