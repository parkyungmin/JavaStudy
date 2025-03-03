package basic.poly.ex5;

public class Dog implements InterfaceAnimal { //implements : 구현
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
