package basic.final1;

public class FinalFieldMain {
  public static void main(String[] args) {
    //final 필드 - 생성자 초기화 (각 인스턴스마다 다르게 설정 가능)
    System.out.println("생성자 초기화");
    ConstructInit constructInit1 = new ConstructInit(10);
    ConstructInit constructInit2 = new ConstructInit(20);
    System.out.println(constructInit1.value);
    System.out.println(constructInit2.value);

    //final 필드 - 필드 초기화 (초기화가 되어 있기 때문에 변경 x)
    //단점 - 메모리 중복 사용으로 인한 낭비 -> static final을 통해 이를 해결
    System.out.println("필드 초기화");
    FieldInit fieldInit1 = new FieldInit();
    FieldInit fieldInit2 = new FieldInit();
    FieldInit fieldInit3 = new FieldInit();
    System.out.println(fieldInit1.value);
    System.out.println(fieldInit2.value);
    System.out.println(fieldInit3.value);

    //상수 - static final ()
    System.out.println("상수 출력");
    System.out.println(FieldInit.CONST_VALUE);
  }
}
