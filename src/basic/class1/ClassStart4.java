package basic.class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //student 타입의 변수는 basic.class1.Student 인스턴스의 참조값을 보관
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //student2는 참조값을 보관
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //basic.class1.Student 배열 생성 - 각 항목도 참조값을 보관 (null 값으로 초기화)
        Student[] students = new Student[2]; //배열도 new로 생성하여 배열이 메모리에 올라가기 때문에 참조값을 갖는다.
        //★★자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.★★ => 참조값을 복사한다. 인스턴스가 하나 더 생기는 것이 아닌!! 참조값을 복사한다.(집으로 갈 수 있는 지도를 2개 만드는 거지 집을 두 개 만드는 게 아님)
        students[0] = student1; //x001
        students[1] = student2; //x002

        System.out.println("이름:"+students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:"+students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

    }
}
