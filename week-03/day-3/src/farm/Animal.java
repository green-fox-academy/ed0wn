package farm;

public class Animal {
  int hunger;
  int thirst;

  public Animal(){
    this.hunger=50;
    this.thirst=50;
  }

  public void eat(){
    hunger-=1;
  }
  public void drink(){
    thirst-=1;
  }
  public void play(){
    hunger+=1;
    thirst+=1;
  }
}
