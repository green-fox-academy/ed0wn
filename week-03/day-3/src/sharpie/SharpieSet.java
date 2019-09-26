package sharpie;

import java.util.ArrayList;
import java.util.List;


public class SharpieSet {

    List<Sharpie> sharpies = new ArrayList<>();
  public int countUsable(){
    int count=0;
    for (Sharpie sharpie : sharpies) {
      if (sharpie.inkAmount>0){
        count++;
      }
    }
    return count;
  }
  public void removeTrash(){
    for (int i = 0; i < sharpies.size() ; i++) {
      if (this.sharpies.get(i).inkAmount <= 0){
        this.sharpies.remove(i);
      }
    }
  }
}
