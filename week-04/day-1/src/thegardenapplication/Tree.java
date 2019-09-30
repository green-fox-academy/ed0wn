package thegardenapplication;

public class Tree extends Plants{

  Tree(String color){
    setAbsorbPercentage(0.4);
    setColor(color);
    setNeedWater(true);
    setWaterLevel(0.0);
    setName("Tree");
    setNeededAmount(10);
  }
  Tree(){
    super();
  }
}
