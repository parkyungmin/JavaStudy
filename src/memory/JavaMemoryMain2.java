package memory;

/**
 * 자바메모리 - 스택 영역과 힙 영역
 *
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
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value= " + data2.getValue());
        System.out.println("method2 end");
    }
}
