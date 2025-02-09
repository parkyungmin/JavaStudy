package basic.extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super(); //기본 생성자 생략 가능, 항상 첫줄에 사용, 예외 this 또는 super사용
        // but, 자식class에서 한 번은 super()가 반드시 호출 되어야 한다!!!
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능, 안써도 자바가 자동으로 만듬
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
