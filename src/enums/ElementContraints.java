package enums;

public enum ElementContraints {
    START(1),
    END(1000);

    private int value;

    ElementContraints(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
