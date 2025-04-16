package mid1.lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'Java'가 포함되어 있는지 : " + str.contains("Java")); // true
        System.out.println("'Java'의 첫 번째 인덱스 : " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java'의 인덱스 : " + str.indexOf("Java", 10));
        System.out.println("'Java'의 마지막 인덱스 : " + str.lastIndexOf("Java")); // 뒤에서부터 조회
        System.out.println("'Java'의 마지막 인덱스 : " + str.lastIndexOf("Java", 6)); // -1 반환, 인덱스 6부터 거꾸로 조회
    }
}
