public class AreaCalculator {

    private static final double PHI = 3.14;

    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        }
        double areaOfCircle = radius * radius * PHI;
        return areaOfCircle;
    }
}
