package mid2.generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // Raw 타입, 원시타입이라고 한다.
        //GenericBox<Object> integerBox = new GenericBox<>(); // <-- 이렇게 쓰는 것을 권장

        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // 다운캐스팅
        System.out.println("integer = " + integer);
    }
}
