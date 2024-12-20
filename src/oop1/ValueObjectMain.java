package oop1;

/* 클래스의 속성과 메서드 - 데이터와 기능 부분을 따로 구현하지 않고 같이 정의 */
public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();

        System.out.println("최종 숫자=" + valueData.value);
    }

}
