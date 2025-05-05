package mid2.generic.ex2;

public class Box<T> { // 제너릭 타입
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
