package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // null은 참조값이 없다라는 의미이다.
        InitData data = null;
        System.out.println("1. data = " + data);

        // 참조값 할당. 메모리에 인스턴스 생성. 이때 InitData 클래스에 있는 value1,2 초기화 됨
        data = new InitData();
        System.out.println("2. data = " + data);

        // 아무도 사용하지 않는 인스턴스가 됨. -> GC가 자동으로 메모리에서 인스턴스를 정리해준다.
        data = null;
        System.out.println("3. data = " + data);
    }
}
