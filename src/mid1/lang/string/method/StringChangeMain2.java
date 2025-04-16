package mid1.lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming";

        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());

        // 공백제거
        System.out.println("공백 제거(trim) : '" + strWithSpaces.trim() + "'"); // 스페이스바로 생긴것만 제거
        System.out.println("공백 제거(strip) : '" + strWithSpaces.strip() + "'"); // 특수 공백도 제거 가능 (=유니코드 공백 포함)
        System.out.println("앞 공백 제거(strip) : '" + strWithSpaces.stripLeading() + "'"); // 특수 공백도 제거 가능 (=유니코드 공백 포함)
        System.out.println("뒤 공백 제거(strip) : '" + strWithSpaces.stripTrailing() + "'"); // 특수 공백도 제거 가능 (=유니코드 공백 포함)
    }
}
