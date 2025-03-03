package mid2.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

//        Object object = objectBox.get(); //반환되는 타입은 object이다.
//        Integer integer = (Integer) object; //다운캐스팅
        // 한 줄로 작성
        Integer integer2 = (Integer) integerBox.get(); //다운캐스팅 (자식은 부모를 담을 수 없다)
        System.out.println("integer = " + integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //다운캐스팅
        System.out.println("string = " + str);

        //잘못된 타입의 인수 전달 문제 (넣는건 문제가 안되지만, 꺼낼때 컴파일 에러)
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); //문자가 들어있는데 Integer로 캐스팅할려고 하면 컴파일 에러 남.
        System.out.println("result = " + result);

        



    }
}
