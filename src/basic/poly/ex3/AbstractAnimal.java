package basic.poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound(); //추상 메서드는 바디가 없기 때문에 클래스가 생성돼서 호출이 되면 안되므로 클래스가 추상클래스여야 한다.

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
