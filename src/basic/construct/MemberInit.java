package basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    /**
     * 기본 생성자 = 매개변수가 없는 생성자
     * 클래스에 생성자가 하나도 없으면 자바는 기본적으로 '기본 생성자'를 생성한다.
     */
    MemberInit() { //기본 생성자

    }

    /**
     * 추가 - this. : 자기 자신의 인스턴스를 가르킴 (매개변수와 구별하기 위해 사용)
     */
    void initMember(String name, int age, int grade) {
        this.name = name; //x001.name = name;
        this.age = age; //x001.age = age;
        this.grade = grade; //x001.grade = grade;
    }
}
