package access.a;

/**
 * 접근제어자 - 필드, 메서드
 *
 */
public class AccessData {
    public int publicField;
    int defaultFeild;
    private int privateFeild;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }
    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultFeild);
    }
    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateFeild);
    }
    
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultFeild = 200;
        privateFeild = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
