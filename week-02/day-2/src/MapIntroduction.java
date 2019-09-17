import java.util.HashMap;
import java.util.Map;

public class MapIntroduction {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");

        if (map.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
        for (Integer key : map.keySet()) {
            System.out.println(key);

        }
        for (String value : map.values()) {
            System.out.println(value);
        }
        map.put(68, "D");
        int size= 0;
        for (int i = 0; i < map.size();i++) {
            size= i+1;
        }
        System.out.println(size);
        System.out.println(map.get(99));
        map.remove(97);
        for (String value : map.values()) {
            System.out.println(value);
        }
        if (map.containsKey(100)) {
            System.out.println("there is an associated value with key 100");
        }
        else {
            System.out.println("there is no associated value with key 100");
        }

        map.clear();

    }
}
