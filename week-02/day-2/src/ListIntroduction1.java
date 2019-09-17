import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("William");
        int numberOfElements = 0;
        names.add("John");
        names.add("Amanda");
        for (int i=0;i<=names.size();i++) {
            numberOfElements = i;
        }
        System.out.println(numberOfElements);
        System.out.println(names.get(2));
        for (int i= 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        int iterNum =0;
        for (int i= 0; i < names.size(); i++){
            iterNum = i+1;
            System.out.println(iterNum + ". " + names.get(i));

        }

        names.remove(1);
        Collections.reverse(names);
        for (int i= 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


    }
}
