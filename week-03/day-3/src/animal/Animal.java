package animal;

public class Animal {
  static int hunger=50;
  static int thirst =50;

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
