package extends1.ex2;

/**상속 - java는 다중 상속을 지원하지 않는다. extends 대사은 하나만 선택할 수 있다. 자식 -> 부모
 * 다중상속x => 인터페이스의 다중 구현을 허용해서 이러한 문제를 해결
 */
public class CarMain {
  public static void main(String[] args) {
    ElectricCar electricCar = new ElectricCar();
    electricCar.move(); //Car에서 상속받아서 사용
    electricCar.charge();

    GasCar gasCar = new GasCar();
    gasCar.move(); //Car에서 상속받아서 사용
    gasCar.fillUp();
  }
}
