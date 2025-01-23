package basic.access.a;

/**
 * 접근제어자 - 클래스 레벨
 * public class는 파일명과 동일해야 하고 하나만 쓸 수 있다.
 * default class는 무한정 생성 가능하다.
 */
public class PublicClass {
    public static void main(String[] args) {
            PublicClass publicClass = new PublicClass();
            DefaultClass1 class1 = new DefaultClass1();
            DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}
class DefaultClass2 {

}
