package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public abstract void sound();

  @Override
  public void play() {
    System.out.print(name +" , a " +numberOfStrings+ "-stringed instrument that goes ");
    sound();
  }
}
