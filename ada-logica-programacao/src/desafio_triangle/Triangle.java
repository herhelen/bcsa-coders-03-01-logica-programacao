package desafio_triangle;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Triangle {

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateSemiperimeter(double a, double b, double c) {
        return round(calculatePerimeter(a, b, c) / 2);
    }

    public static double calculateArea(double a, double b, double c) {
        double semiperimeter = calculateSemiperimeter(a, b, c);
        double area = semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c);
        area = Math.sqrt(area);
        return round(area);
    }

    public static double calculateHeight(double base, double area) {
        return round(2 * area / base);
    }

    private static double calculateArcCosInput(double x, double y, double z) {
        return (Math.pow(y, 2) + Math.pow(z, 2) - Math.pow(x, 2)) / (2 * y * z);
    }

    private static double calculateAngle(double x, double y, double z) {
        double angleRad = Math.acos(calculateArcCosInput(x, y, z));
        return Math.toDegrees(angleRad);
    }

    public static String[] calculateAngles(double a, double b, double c) {
        double alpha = calculateAngle(a, b, c);
        double beta = calculateAngle(b, a, c);
        double gamma = 180 - alpha - beta;

        String[] angles = {
                degressToString(alpha).replace(",", "."),
                degressToString(beta).replace(",", "."),
                degressToString(gamma).replace(",", ".")
        };

        return angles;
    }

    public static double calculateInradius(double a, double b, double c) {
        return round(calculateArea(a, b, c) / calculateSemiperimeter(a, b, c));
    }

    public static double calculateCircumradius(double a, double b, double c) {
        double inradius = calculateInradius(a, b, c);
        double semiperimeter = calculateSemiperimeter(a, b, c);
        return round((a * b * c) / (4 * inradius * semiperimeter));
    }

    private static double calculateMedian(double x, double y, double z) {
        return Math.sqrt(
                (2 * Math.pow(y, 2)) +
                (2 * Math.pow(z, 2)) -
                Math.pow(x, 2)) / 2;
    }

    public static double[] calculateMedians(double a, double b, double c) {
        double[] medians = {
            round(calculateMedian(a, b, c)),
            round(calculateMedian(b, a, c)),
            round(calculateMedian(c, a, b))
        };

        return medians;
    }

    private static double round(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    private static String degressToString(double angle) {
        double degrees = Math.floor(angle);
        double decimalMinutes = (angle - degrees) * 60;
        double minutes = Math.floor(decimalMinutes);
        double seconds = (decimalMinutes - minutes) * 60;

        return String.format("%.0f° %.0f' %.2f\"", degrees, minutes, seconds);
    }


}
