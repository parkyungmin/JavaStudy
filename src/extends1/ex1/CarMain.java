package extends1.ex1;

/**상속
 * - 전기차와 가솔린차는 move()가 동일하다. -> 상속 관계를 사용하는 것이 효과적이다.
 */
public class CarMain {
  public static void main(String[] args) {
    ElectricCar electricCar = new ElectricCar();
    electricCar.move();
    electricCar.charge();

    GasCar gasCar = new GasCar();
    gasCar.move();
    gasCar.fillUp();
  }
}
