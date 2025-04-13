public class Squareroot {
    public static double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot find square root of negative number.");
        }
        return Math.sqrt(a);
}
}