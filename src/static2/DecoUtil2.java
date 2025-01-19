package static2;

/**
 * static 메서드 = 정적 메서드, 클래스 메서드
 * <-> 인스턴스 메서드 (객체생성을 통해 사용가능한 메서드) */
public class DecoUtil2 {

  public static String deco(String str) {
    return "*" + str + "*";
  } //메서드 앞에 static 추가 -> 인스턴스 생성없이 호출 가능.
}
