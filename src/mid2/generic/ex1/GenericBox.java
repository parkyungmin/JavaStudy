package mid2.generic.ex1;

/**
 * Generic Class : 제너릭 클래스
 * <T> : 타입 매개변수 - 이후에 Integer, String으로 변할 수 있다.
 */
public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
