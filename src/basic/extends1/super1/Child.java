package basic.extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // 자기자신(현재 내 타입), this 생략 가능
        System.out.println("super value = " + super.value); // 내 부모

        this.hello();
        super.hello();
    }
}
