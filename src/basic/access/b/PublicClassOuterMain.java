package basic.access.b;

//import basic.access.a.DefaultClass1; //import 해도 안 됨
//import basic.access.a.DefaultClass2; //import 해도 안 됨
import basic.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가
//        DefaultClass1 basic.class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
    }
}
