package mid1.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // == : 동일성 확인 (참조값, 실제 메모리 => '물리적')
        System.out.println("identity = " + (user1 == user2)); //연산자 우선순위 때문에 () 넣어줌.
        // equals : 동등성 확인
        System.out.println("equality = " + (user1.equals(user2))); // Object.equals()는 '=='으로 비교한다. ~> 오버라이딩 필요

    }
}
