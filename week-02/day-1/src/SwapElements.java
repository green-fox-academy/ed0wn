import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String abc [] = {"first", "second", "third"};
        String swap = abc [0];
        abc [0] = abc[2];
        abc [2] = swap;
        for (int i= 0; i<abc.length; i++){
            System.out.println(abc[i]);
        }

    }
}
