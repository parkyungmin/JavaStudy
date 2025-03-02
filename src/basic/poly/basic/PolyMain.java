package basic.poly.basic;


/**
 * 다형적 참조 - 부모는 자식을 담을 수 있다.
 *
 * */
public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod(); // 메모리에 부모 클래스만 생성

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child(); //부모, 자식 클래스 모두 생성
        child.parentMethod(); //자식클래스에서 먼저 찾고 없으면 부모클래스에서 찾음.
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //Parent(부모) 타입인데 Child 참조를 넣음
        poly.parentMethod();

//        poly.childMethod(); // 컴파일 에러 : 자식의 기능을 호출 할 수 없다.
//        Child child1 = new Parent(); // 컴파일 에러 : 자식은 부모를 담을 수 없다.

    }
}
