package basic.ref;

public class Method2 {
  public static void main(String[] args) {
    /* Method2 리팩토링 - 객체 생성 중복 제거 */
    Student student1 = createStudent("학생1", 15, 90);
    Student student2 = createStudent("학생2", 16, 80);

    printStudent(student1);
    printStudent(student2);
  }

  /* 생성과 초기화 동시에 수행 */
  static Student createStudent(String name, int age, int grade) {
    Student student = new Student();
    student.name = name;
    student.age = age;
    student.grade = grade;

    return student; //참조값 반환
  }

  /* 초기화 */
//  static void initStudent(Student student, String name, int age, int grade) {
//    student.name = name;
//    student.age = age;
//    student.grade = grade;
//  }

  /* 출력 */
  static void printStudent(Student student) {
    System.out.println("이름:"+ student.name + " 나이:" + student.age + " 성적:" + student.grade);
  }
}
