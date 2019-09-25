package sharpie;

public class Sharpie {
  String color;
  float width;
  static float inkAmount=100;

  public void use(){
    inkAmount-=1;
  }
}
