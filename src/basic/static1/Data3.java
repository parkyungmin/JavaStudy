package basic.static1;

/** static - static 변수, 정적변수, 클래스변수
 * 붕어빵틀에서 관리하므로 클래스 변수도 하나이다.
 */
public class Data3 {
  public String name;
  public static int count; //static
  public Data3(String name) {
    this.name = name;
//    Data3.count++; //원래는 이렇게 사용해야함. 클래스.변수
    count++; //같은 클래스 내에서는 생략가능
  }
}
