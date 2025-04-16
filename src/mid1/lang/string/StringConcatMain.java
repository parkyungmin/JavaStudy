package mid1.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // ★원칙적으로 참조값 끼리 연산을 할 수 없다. 하지만, 자주 사용하니 기능 제공을 하는 거임.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
