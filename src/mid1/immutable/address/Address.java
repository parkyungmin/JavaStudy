package mid1.immutable.address;

public class Address {
    private String value;

    public String getValue() {
        return value;
    }

    public Address(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
