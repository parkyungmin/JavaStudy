package mid1.lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //x001
        String str2 = "hello, java!"; //x002
        String str3 = "Hello, World!"; //x003

        System.out.println("str1 equals str2 : " + str1.equals(str2)); //false
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2)); // Case(대소문자) Ignore(무시) true 반환
        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); // 1

        System.out.println("'b' compareTo 'a' : " + "c".compareTo("a")); // 2
        System.out.println("str1 comparTo str3 : " + str1.compareTo(str3)); // 13 사전적으로 비교
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2)); // 0

        System.out.println("str1 start with 'Hello' : " + str1.startsWith("Hello")); // true Hello 로 시작
        System.out.println("str1 ends with 'Java!' : " + str1.endsWith("Java!")); // true Java! 로 끝남
    }
}
