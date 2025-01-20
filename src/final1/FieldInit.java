package final1;

public class FieldInit {
  static final int CONST_VALUE = 10; //상수 대문자로 표현(관례)
  final int value = 10;

  //컴파일 에러 - 이미 vlaue에 초기값이 들어가서 변경 X
//  public FieldInit(int value) {
//    this.value = value;
//  }
}
