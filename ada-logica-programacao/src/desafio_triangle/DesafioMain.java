package desafio_triangle;

import java.util.Arrays;

public class DesafioMain {
    public static void main(String[] args) {
        System.out.printf("calculatePerimeter: %s%n", Triangle.calculatePerimeter(5, 10, 10) == 25);
        System.out.printf("calculateSemiperimeter: %s%n", Triangle.calculateSemiperimeter(5, 10, 10) == 12.5);
        System.out.printf("calculateArea: %s%n", Triangle.calculateArea(5, 10, 10) == 24.21) ;
        System.out.printf("calculateHeight: %s%n", Triangle.calculateHeight(5, 24.21) == 9.68);
        System.out.printf("calculateHeight: %s%n", Triangle.calculateHeight(10, 24.21) == 4.84);
        System.out.printf("calculateHeight: %s%n", Triangle.calculateHeight(10, 24.21) == 4.84);
        System.out.printf("calculateAngles: %s%n",
                Arrays.equals(
                        Triangle.calculateAngles(5, 10, 10),
                        new String[]{"28° 57' 18.09\"", "75° 31' 20.96\"", "75° 31' 20.96\""}));
        System.out.printf("calculateInradius: %s%n", Triangle.calculateInradius(5, 10, 10) == 1.94);
        System.out.printf("calculateCircumradius: %s%n", Triangle.calculateCircumradius(5, 10, 10) == 5.15);
        System.out.printf("calculateMedians: %s%n",
                Arrays.equals(Triangle.calculateMedians(5, 10, 10), new double[]{9.68, 6.12, 6.12}));
    }
}