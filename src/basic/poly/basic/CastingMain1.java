package basic.poly.basic;

/**
 * 다운캐스팅
 */
public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
//        Child child = poly; //x001 컴파일 에러 발생 : 부모는 자식을 담을 수 없다.
        Child child = (Child) poly; //--강제로 변경-- = '다운캐스팅'
        child.childMethod();
    }
}
