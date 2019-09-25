package PetrolStation;

public class Main {

  public static void main(String[] args) {
    Station station =new Station(500);
    Car car = new Car();
    car.refill(station);
    System.out.println(station.gasAmount);
    System.out.println(car.capacity);
    System.out.println(car.gasAmount);
  }
}
