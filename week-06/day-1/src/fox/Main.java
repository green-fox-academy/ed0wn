package fox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Main {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    Fox fox1= new Fox("Béla", "green", 6);
    Fox fox2= new Fox("Sanyi", "red", 7);
    Fox fox3= new Fox("Gyuri", "green", 2);
    Fox fox4= new Fox("Karak", "red", 3);
    Fox fox5= new Fox("Vuk", "green", 6);
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);
    List<Fox> sortedFoxes= foxes.stream()
            .filter(s -> s.getColor().equals("green"))
            .collect(Collectors.toList());
    System.out.println(sortedFoxes);

    List<Fox> sortedFoxes2 = foxes.stream()
            .filter(s -> s.getAge() < 5)
            .filter(s -> s.getColor().equals("green"))
            .collect(Collectors.toList());
    System.out.println(sortedFoxes2);

    Map<String, Integer> frequencies = foxes.stream()
            .collect(toMap(
                    Fox::getColor,
                    v -> 1,
                    Integer::sum));
    System.out.println(frequencies);
  }
}
