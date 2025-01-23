package basic.construct;

/**
 * 생성자 호출 - new 생성자(=클래스)이름(생성자에 맞는 인수 목록)
 * 생성자 장점 : 생성자 호출 필수 = 생성자에 맞는 인수 목록을 작성 안할시 컴파일 에러를 발생 시킴
 */
public class ConstructMain1 {
    public static void main(String[] args) {
        //객체를 생성하면서 한 번에 초기화
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}
