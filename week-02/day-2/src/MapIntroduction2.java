import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("978-1-60309-452-8", "A Letter to Jo");
        map.put("978-1-60309-459-7", "Lupus");
        map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map.put("978-1-60309-461-0", "The Lab");
        Iterator<String> itrKeys = map.keySet().iterator();
        Iterator<String> itrValues = map.values().iterator();
        while (itrKeys.hasNext() && itrValues.hasNext()){
            System.out.println(itrValues.next() + " (ISBN: " + itrKeys.next() + ")");
        }

        map.remove("978-1-60309-444-3");

        for (Map.Entry<String,String> obj: map.entrySet()) {
            if (obj.getValue()=="The Lab"){
                map.remove(obj.getKey());
            }
        }

        map.put ("978-1-60309-450-4" , "They Called Us Enemy");
        map.put ("978-1-60309-453-5" , "Why Did We Trust Him?");


        for (Map.Entry<String,String> obj: map.entrySet()) {
            if (obj.getKey() == "478-0-61159-424-8") {
                System.out.println("The paired value is: " + obj.getValue());
            } else {
                System.out.println("There is no paired value");
            }

        }
        for (Map.Entry<String,String> obj: map.entrySet()) {
            if (obj.getKey() == "978-1-60309-453-5") {
                System.out.println("The paired value is: " + obj.getValue());
            }

        }
    }
}
