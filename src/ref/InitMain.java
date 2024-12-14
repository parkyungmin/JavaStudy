package ref;

public class InitMain {
    /*변수의 종류(1. 멤버변수, 2. 지역변수)*/
    public static void main(String[] args) {
        InitData data = new InitData();

        //멤버변수(=필드)는 자동으로 초기화를 해준다. (int는 0, boolean = false, 참조형은 null)
        System.out.println(data.value1);
        System.out.println(data.value2);

    }
}
