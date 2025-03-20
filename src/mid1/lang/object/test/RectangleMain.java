package mid1.lang.object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100,20); //x001
        Rectangle rect2 = new Rectangle(100,20); //x002

        //
        System.out.println(rect1);
        System.out.println(rect2);
        // 동일성
        System.out.println(rect1 == rect2); //false
        // 동등성
        System.out.println(rect1.equals(rect2)); //true
    }
}
