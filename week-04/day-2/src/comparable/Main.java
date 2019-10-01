package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);

    List <Thing>fleet = new ArrayList();
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing first =new Thing("Get milk");
    Thing second = new Thing("Remove the obstacles");
    Thing third = new Thing("Stand up");
    Thing fourth = new Thing("Eat lunch");
    third.complete();
    fourth.complete();
    fleet.add(first);
    fleet.add(second);
    fleet.add(third);
    fleet.add(fourth);

    Collections.sort(fleet);
  }
}
