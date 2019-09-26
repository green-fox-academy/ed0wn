package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> animals =new ArrayList<>();
  int places;

  public void breed(Animal animal) {
    if (animals.size() < places) {
      animals.add(animal);
    }
  }
  Animal waitingToBeSlaughtered= new Animal();
  public void slaughter(){
    int index=0;
    for (int i = 0; i < animals.size(); i++) {
      if (waitingToBeSlaughtered.hunger < animals.get(i).hunger){
        waitingToBeSlaughtered=animals.get(i);
        index= i;
      }
    }
    animals.remove(index);
  }
}
