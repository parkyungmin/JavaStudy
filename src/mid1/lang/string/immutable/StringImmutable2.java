package mid1.lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello"; // x001 '문자열 풀'
        String str2 = str.concat(" java"); // 문자열을 합치고 새로운 객체(참조값)을 return

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String str3 = "";
        String str4 = " ";
        String str5 = null;

        System.out.println("str3.length() = " + str3.isEmpty()); //
        System.out.println("str4.length() = " + str4.isBlank()); //true
        System.out.println("str4.length() = " + str4.isEmpty()); //false
    }
}
