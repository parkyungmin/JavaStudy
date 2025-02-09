package basic.extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
//        super(); //에러
        super(10, 20); //기본생성자가 없기 때문에 직접 호출
        System.out.println("ClassC 생성자");
    }
}
