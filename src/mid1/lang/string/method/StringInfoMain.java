package mid1.lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열의 길이  : " + str.length()); // 12
        System.out.println("문자열이 비어 있는지 : " + str.isEmpty()); // length가 0일 때 true이므로 false
        System.out.println("문자열이 비어 있거나 공백인지1 : " + str.isBlank()); // false
        System.out.println("문자열이 비어 있거나 공백인지2 : " + "   ".isBlank()); // 공백인 경우 true

        char c = str.charAt(7); // 인덱스 7 return (인덱스 0부터 시작)
        System.out.println("7번 인덱스의 문자 = " + c);
    }
}
