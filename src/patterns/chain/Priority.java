package patterns.chain;

public enum Priority {
    ROUTINE(1), IMPORTANT(2), EMERGENCY(3) ;

    private int value;

    public int getValue() {
        return value;
    }

    Priority(int value) {
        this.value = value;
    }
}
