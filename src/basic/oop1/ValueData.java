package basic.oop1;

public class ValueData {
    /*멤버변수*/
    int value;

    /*기능(메서드)*/
    void add() {
        value++; //value에 접근할 때 기본적으로 본인 인스턴스에 있는 멤버변수에 접근.
        System.out.println("숫자 증가 value=" + value);
    }
}
