public class Main {
    public static void main(String[] args) {

        GenericNumeric<Double> num1 = new GenericNumeric<>(9.76);
        System.out.println("Reciprocal: " + num1.reciprocal());
        System.out.println("Fractional Part: " + num1.fractionalPart());

        Double d = -5.5;
        Float f = 5.5f;

        System.out.println("Absolute values equal: " +
                GenericNumeric.absEqual(d, f));
    }
}