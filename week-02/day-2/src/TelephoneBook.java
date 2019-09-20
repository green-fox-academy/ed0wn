import sun.awt.SunHints;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
//We are going to represent our contacts in a map where the keys are going to be strings and the values are going to be strings as well.
//
//        Create a map with the following key-value pairs.
//
//                Name (key)	Phone number (value)
//                William A. Lathan	405-709-1865
//                John K. Miller	402-247-8568
//                Hortensia E. Foster	606-481-6467
//                Amanda D. Newland	319-243-5613
//                Brooke P. Askew	307-687-2982
//
//        Create an application which solves the following problems.
//
//                  What is John K. Miller's phone number?
//                   Whose phone number is 307-687-2982?
//                  Do we know Chris E. Myers' phone number?

        HashMap<String,String> map= new HashMap<>();
        map.put("William A. Lathan","405-709-1865");
        map.put("John K. Miller","402-247-8568");
        map.put("Hortensia E. Foster","606-481-6467");
        map.put("Amanda D. Newland", "319-243-5613");
        map.put("Brooke P. Askew", "307-687-2982");

        System.out.println(map.get("John K. Miller"));

        for (Map.Entry<String,String> obj: map.entrySet()) {
            if (obj.getValue() == "307-687-2982"){
                System.out.println(obj.getKey());
            }
        }
        String chris = "";
        for (Map.Entry<String,String> obj: map.entrySet()) {
            if (obj.getKey() == "Chris E. Myers"){
                chris=obj.getKey();
            }

        }
        if (chris=="Chris E. Myers"){
            System.out.println("We have found the paired number");
        }
        else{
            System.out.println("System error");
        }

    }
}
