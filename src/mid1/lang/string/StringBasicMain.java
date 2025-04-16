package mid1.lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; //기본형이 아닌 참조형이기 때문에 str1에는 참조값이 들어가야한다.
        // => "hello"로 적으면 자동으로 new String("hello");로 변경

        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
