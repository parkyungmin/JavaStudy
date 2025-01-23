package basic.construct;

/**
 * 생성자 도입
 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

    /**
     * 생성자 추가 - 생성자 오버로딩
     */
    MemberConstruct(String name, int age) {
        //this() : 첫줄에서만 작성할 수 있다. 아니면 컴파일 에러
        this(name,age,50); //변경 - this() : 생성자 내부에서 자신의 생성자를 호출할 수 있다.

        // 중복제거
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    /**
     * 생성자 - 클래스 명이랑 동일, 반환 타입 없음
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
