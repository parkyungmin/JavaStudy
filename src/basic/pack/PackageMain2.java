package basic.pack; //코드 첫 줄 - package

import basic.pack.a.User; //import - 경로 생략 가능
import basic.pack.a.User2;

//이렇게도 사용 가능
//import basic.pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); //패키지가 동일
        User user = new User(); //import 사용
        User2 user2 = new User2();

    }
}
