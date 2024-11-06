public class ClassStart3 {
    public static void main(String[] args) {
        //숫자형을 저장할 있게 int 타입을 만들었고 문자형을 저장할 수 있게 stirng 타입을 만듬.
        //-> 학생이라는 타입을 만듬. 사용자가 직접 정의하는 타입. => 설계도 = 클래스
        Student student1;
        student1 = new Student(); //설계도를 기반으로 학생1을 메모리에 실제로 만듬 = 인스턴스(객체)
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        //Q. 오케이 new하면 메모리에 생성되는 건 알겠는데, 어디에 생성되었는지 어떻게 알지?
        Student student2;
        student2 = new Student(); //A. new로 생성하고 나면 메모리 주소인 참조값을 student2에 반환한다. ->student2를 통해 메모리 접근가능
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //참조값 출력
        System.out.println(student1); //2f4d3709 (16진수값)
        System.out.println(student2); //4e50df2e

        System.out.println("이름:"+student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:"+student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

    }
}
