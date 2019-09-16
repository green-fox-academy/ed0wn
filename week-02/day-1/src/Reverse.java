public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int aj []= {3, 4, 5, 6, 7};
        int reverse [] = new int[5];
        int length = 5;

        for (int i =0; i<aj.length; i++) {
            System.out.print(aj[i]);
            reverse[length-1]= aj[i];
            length = length-1;
            System.out.println(reverse[i]);
        }
        System.out.println("---------------");
        for (int i=0 ;i<aj.length;i++)
            System.out.println(reverse[i]);
    }
}
