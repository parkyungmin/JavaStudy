package basic.poly.car0;

/**
 * 문제점 - 자동차가 추가될 때 마다 클라이언트 소스를 다 고쳐야한다.
 * 해결방안 - 역할(인터페이스)과 구현(객체)을 분리 -> 클라이언트는 고칠 필요가 없어진다.
 */

public class CarMain0 {
  public static void main(String[] args) {
    Driver driver = new Driver();
    K3Car k3Car = new K3Car();
    driver.setK3Car(k3Car);
    driver.drive();

    //차량 변경해서 운전 (k3 -> model3)
    Model3Car model3Car = new Model3Car();
    driver.setK3Car(null);
    driver.setModel3Car(model3Car);
    driver.drive();
  }
}
