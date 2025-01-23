package basic.pack;

/**
 * 이름이 겹치면 import는 하나만 사용 가능하다!
 * import basic.pack.b.User; 쓰면 에러남
 * 그래서 보통 자주 사용하는 것을 import 시킨다.
 */
import basic.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User user = new User();
        basic.pack.b.User userB = new basic.pack.b.User();
    }
}

