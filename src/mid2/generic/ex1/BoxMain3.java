package mid2.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점의 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("문자100"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); //return Integer 타입. => 다운 캐스팅 할 필요 없음.
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

    }
}
