package basic.class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); //student 타입의 변수는 basic.class1.Student 인스턴스의 참조값을 보관
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //student2는 참조값을 보관
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //Student 타입의 배열생성
        Student[] students = {student1, student2};

        for(int i=0; i<students.length; i++){
            System.out.println("이름:"+students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        //for문 간단하게 쓰기
        for(int i=0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름:"+ s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        //향상된 for문
        for(Student s : students) {
            System.out.println("이름:"+ s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
