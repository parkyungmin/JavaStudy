package basic.ref;

public class Method1 {
  public static void main(String[] args) {
    /* basic.class1.ClassStart3 중복제거 - 변수 초기화 및 출력 */
    Student student1 = new Student(); //설계도를 기반으로 학생1을 메모리에 실제로 만듬 = 인스턴스(객체)
    initStudent(student1,"학생1", 15, 90);

    Student student2 = new Student();
    initStudent(student2,"학생2", 16, 80);

    printStudent(student1);
    printStudent(student2);
  }

  /* 초기화 */
  static void initStudent(Student student, String name, int age, int grade) {
    student.name = name;
    student.age = age;
    student.grade = grade;
  }

  /* 출력 */
  static void printStudent(Student student) {
    System.out.println("이름:"+ student.name + " 나이:" + student.age + " 성적:" + student.grade);
  }
}
