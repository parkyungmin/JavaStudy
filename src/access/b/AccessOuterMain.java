package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 default 호출 불가
//        data.defaultFeild = 2;
//        data.defaultMethod();

        //private 호출 불가
//        data.privateFeild = 3;

        //내부호출
        data.innerAccess();
    }
}
