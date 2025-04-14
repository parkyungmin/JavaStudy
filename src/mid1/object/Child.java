package mid1.object;

// 명시적으로 상속을 받으면 Object 클래스 상속을 받지 않는다.
public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
