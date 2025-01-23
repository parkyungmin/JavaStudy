package basic.memory;

/**
 * 자바메모리 - 스택구조
 * 스택영역을 사용하여 메서드 호출과 지역 변수를 관리
 * 지역변수(매개변수 포함) 스택 영역에서 관리
 * 스택 프레임이 종료되면 지역 변수도 함께 제거된다.
 * 스택 프레임이 모두 제거되면 프로그램도 종료된다.
 */
public class JavaMemoryMain1 {
    public static void main(String[] args) { //main()을 위한 스택 프레임 생성
        System.out.println("main start");
        method1(10); //method1() 스택 프레임 생성
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal); //method2() 스택 프레임 생성
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
