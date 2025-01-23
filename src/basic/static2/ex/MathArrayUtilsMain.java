package basic.static2.ex;

import static basic.static2.ex.MathArrayUtils.*; //static import시 클래스의 정적변수, 정적메서드를 클래스 이름없이 바로 사용가능하게 해준다.

/**
 * 클래스 메서드('static Method')
 * MathArrayUtils은 객체를 생성하지 않고 사용해야한다.
 * 조건1 - 누군가 실수로 인스턴스를 생성하지 못하게 막으세요.
 */
public class MathArrayUtilsMain {
  public static void main(String[] args) {
    int[] values = {1,2,3,4,5};
    System.out.println("sum = " + MathArrayUtils.sum(values));
    System.out.println("average = " + MathArrayUtils.average(values));
    System.out.println("min = " + MathArrayUtils.min(values));
    System.out.println("max = " + MathArrayUtils.max(values));

    // --> static import를 활용하여 더 간결하게 사용한다.
    System.out.println("sum = " + sum(values));
    System.out.println("average = " + average(values));
    System.out.println("min = " + min(values));
    System.out.println("max = " + max(values));
  }

//  MathArrayUtils math = new MathArrayUtils();
}
