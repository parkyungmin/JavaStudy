package mid1.lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java"); // return 값이 있음
        System.out.println("str = " + str); //불변객체이기 때문에 합쳐지지 않는다.
    }
}
