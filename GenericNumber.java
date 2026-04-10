class GenericNumeric<T extends Number> {

    T num;

    // Constructor
    GenericNumeric(T num) {
        this.num = num;
    }

    // b. Return reciprocal
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // c. Return fractional part
    double fractionalPart() {
        double value = num.doubleValue();
        return value - (int) value;
    }

    // d. Check if absolute values of two numbers are equal
    static boolean absEqual(Number a, Number b) {
        return Math.abs(a.doubleValue()) == Math.abs(b.doubleValue());
    }
}