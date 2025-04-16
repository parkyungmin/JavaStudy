package mid1.lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 : " + (str1 == str2)); // 동일성(참조값) 비교 (false)
        System.out.println("new String() equals() 비교 : " + str1.equals(str2)); // 동등성 비교 (true)

        String str3 = "hello"; // (그냥 이렇게 적는게 문자형 리터럴 이라고 한다.)
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // return값 왜 true가 나오지..? => '문자열 풀'
        System.out.println("리터럴 equals() 비교: " + str3.equals(str4)); //true

        /**
         * 문자열 풀
         * - 프로그램 로딩할 때 리터럴 문자열 사용한 거 보고 인스턴스를 미리 만들어 둔다. 
         * 장점 : 메모리 사용 줄이고, 성능 최적화
         */
    }
}
