package mid1.object.test;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int a, int b) {
        this.width = a;
        this.height = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + width +
                ", b=" + height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }

}
