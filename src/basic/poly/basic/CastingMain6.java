package basic.poly.basic;
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();

        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }

        //자바 16부터는 instanceof에 바로 변수 선언이 가능
        if (parent instanceof Child child) { //변수선언
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent; //필요없어짐
            child.childMethod();
        }
    }
}
