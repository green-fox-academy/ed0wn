package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> ship= fillShip();

  public List<Pirate> fillShip(){
    List<Pirate>ship=new ArrayList<>();
    int max=3;
    int min=1;
    int range=max-min+1;
    int crew = (int) (Math.random()*range+min);
    for (int i = 0; i < crew; i++) {
      if(i==0) {
        ship.add(new Pirate("Captain"))
      }
      else {
        ship.add(new Pirate());
      }
    }
    return ship;
  }
}
