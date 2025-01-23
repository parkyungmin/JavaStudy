package basic.static2;

/**
 * static메서드2 - static메서드는 static에만 접근할 수 있다.
 * 인스턴스 메서드는 인스턴스, static 모두 접근 가능하다.
 */
public class DecoData {
  private int instanceValue;
  private static int staticValue;

  public static void staticCall() {
    staticValue++; //정적변수 접근 가능
//    instanceValue++; //인스턴스 변수 접근 불가능 -> 어디서 호출했는지 모르기 때문에..

    staticMethod(); //정적메서드 접근 가능
//    instanceMethod(); //인스턴스 메서드 접근 불가능 -> 어디서 호출했는지 모르기 때문에..

  }

  public void instanceCall() {
    staticValue++; //정적변수 접근 가능
    staticMethod(); //정적메서드 접근 가능

    instanceValue++; //인스턴스 변수 접근 가능
    instanceMethod(); //인스턴스 메서드 접근 가능
  }

  private void instanceMethod() {
    System.out.println("instanceValue= " + instanceValue);
  }

  private static void staticMethod() {
    System.out.println("staticValue= " + staticValue);
  }

  public static void staticCall(DecoData data) {
    data.instanceValue++;
    data.instanceMethod();

  }
}
