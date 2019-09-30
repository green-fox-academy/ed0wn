package thegardenapplication;

public class Flower  extends Plants{

  public Flower(String color) {
    setNeedWater(true);
    setWaterLevel(0.0);
    setAbsorbPercentage(0.75);
    setColor(color);
    setName("Flower");
    setNeededAmount(5);
  }
  Flower(){

  }
}
