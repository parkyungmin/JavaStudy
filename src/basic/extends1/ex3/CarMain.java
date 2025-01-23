package basic.extends1.ex3;

public class CarMain {
  public static void main(String[] args) {
    ElectricCar electricCar = new ElectricCar();
    electricCar.move(); //Car에서 상속받아서 사용
    electricCar.charge();
    electricCar.openDoor();

    GasCar gasCar = new GasCar();
    gasCar.move(); //Car에서 상속받아서 사용
    gasCar.fillUp();
    gasCar.openDoor();

    HydrogenCar hydrogenCar = new HydrogenCar();
    hydrogenCar.move();
    hydrogenCar.fillHydrogen();
    hydrogenCar.openDoor();

  }
}
