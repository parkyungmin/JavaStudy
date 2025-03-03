package basic.poly.diamond;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodCommnon() {
        System.out.println("Child.methodCommnon");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }
}
