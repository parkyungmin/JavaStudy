package memory;

/**
 * 자바메모리 - 스택 영역과 힙 영역
 * 1.스택 영역 : 지역변수 - 프레임이 사라지면 지역변수 제거
 * 2.힙 영역 : 인스턴스 - 참조되는 부분이 없으면 GC 대상
 */
public class JavaMemoryMain2 {
    public static void main(String[] args) { //main()을 위한 스택 프레임 생성
        System.out.println("main start");
        method1(); //method1() 스택 프레임 생성
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1); //data1 = x001
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value= " + data2.getValue());
        System.out.println("method2 end");
    }
}
