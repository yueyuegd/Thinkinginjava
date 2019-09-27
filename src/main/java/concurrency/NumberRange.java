package concurrency;

public class NumberRange {

    private volatile int lower = 0;
    private volatile int upper = 10;

    public int getLower() {
        return lower;
    }

    public void setLower(int lower) {
        if (lower > upper) {
            throw new IllegalArgumentException("value > upper!");
        }
        this.lower = lower;
    }

    public int getUpper() {
        return upper;
    }

    public void setUpper(int upper) {
        if (upper < lower) {
            throw new IllegalArgumentException("value < lower!");
        }
        this.upper = upper;
    }
}
