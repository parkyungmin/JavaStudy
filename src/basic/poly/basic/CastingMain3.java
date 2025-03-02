package basic.poly.basic;

/**
 * 업캐스팅 - upcasting vs downcasting
 * 생략 가능, 타입 생략 권장
 */
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략 가능, 타입 생략 권장!!
        Parent parent2 = child; //업캐스팅 생략 (자바가 자동으로 넣어줌)

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
