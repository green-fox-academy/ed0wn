package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  @Override
  public void sound() {
    System.out.println("twang");
  }
  ElectricGuitar(){
    numberOfStrings=6;
    name="Electric Guitar";
  }
  ElectricGuitar(int numberOfStrings){
    this.numberOfStrings=numberOfStrings;
    name="Electric Guitar";
  }
}
