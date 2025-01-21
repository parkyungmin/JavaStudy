package extends1.ex2;

public class ElectricCar extends Car { //ElectricCar -> Car (자식은 부모를 알고 있지만, 부모는 누가 자식인지 모름)
  public void charge() {
    System.out.println("충전합니다.");
  }
}
