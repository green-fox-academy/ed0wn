package thegardenapplication;

public class Plants {
  private boolean needWater;
  private double waterLevel;
  private double absorbPercentage;
  private String color;
  private String name;
  private int neededAmount;

  public Plants(boolean needWater, double waterLevel, double absorbPercentage, String color, String name) {
    this.needWater = needWater;
    this.waterLevel = waterLevel;
    this.absorbPercentage = absorbPercentage;
    this.color= color;
    this.name= name;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public void setAbsorbPercentage(double absorbPercentage) {
    this.absorbPercentage = absorbPercentage;
  }

  public double getAbsorbPercentage() {
    return absorbPercentage;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setNeedWater(boolean needWater) {
    this.needWater = needWater;
  }
  public boolean getNeedWater(){
    return needWater;
  }

  public void setName(String name){
    this.name= name;
  }
  public String getName(){
    return this.name;
  }
  public void setNeededAmount(int neededAmount){
    this.neededAmount= neededAmount;
  }
  public int getNeededAmount(){
    return neededAmount;
  }
  Plants(){

  }
  public void statusCheck(){
    if(getNeedWater()) {
      System.out.println("The " + getColor() + " " + getName() + " needs water");
    } else {
      System.out.println("The " + getColor() + " " + getName() + " doesnt need water");
    }
  }

}
