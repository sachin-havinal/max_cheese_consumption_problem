package enums;

public enum ArrayConstraints {
    START(1),
    END(10000);

    private int value;

    ArrayConstraints(int value) {
        this.value = value;
    }
}
