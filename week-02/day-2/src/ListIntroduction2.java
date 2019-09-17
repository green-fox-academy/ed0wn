import java.util.*;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        ArrayList<String> listB = new ArrayList<>(listA);
        listB.remove("Durian");
        listA.add(3, "Kiwifruit");

        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        }

        System.out.println(listA.size());
        System.out.println(listB.size());

        if (listB.size() == listA.size()) {
            System.out.println("List A's size is equal to List B's size");
        }
        else if (listA.size() < listB.size()){
            System.out.println("List B's size is bigger by " + (listB.size()-listA.size()));
        }
        else if (listB.size() < listA.size()){
            System.out.println("List A's size is bigger by " + (listA.size()-listB.size()));
        }

        int avocadoA = listA.indexOf("Avocado");
        int durianB = listB.indexOf("Durian");
        System.out.println(avocadoA);
        System.out.println(durianB);

        List<String>additionalFruits = Arrays.asList("Passion Fruit", "Pomelo");

        listB.addAll(additionalFruits);
        System.out.println(listA.get(2));

    }
}