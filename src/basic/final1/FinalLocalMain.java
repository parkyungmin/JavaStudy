package basic.final1;
/**
 * fianl 지역변수 : 최초 한 번만 값을 넣을 수 있다. */
public class FinalLocalMain {
  public static void main(String[] args) {
    //final 지역 변수1
    final int data1;
    data1 = 10; //최초 한 번만 할당 가능
//    data1 = 20; //컴파일 오류

    //final 지역 변수2
    final int data2 = 10; //선언하면서 초기값 지정
//    data2 = 20; //컴파일 오류
  }

  static void method(final int parameter) {
//    parameter = 20; // 컴파일 오류 값을 변경하지 못한다.
  }
}
