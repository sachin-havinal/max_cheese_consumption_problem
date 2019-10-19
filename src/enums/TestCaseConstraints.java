package enums;

public enum TestCaseConstraints {
    START(1),
    END(200);

    private int value;

    TestCaseConstraints(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
