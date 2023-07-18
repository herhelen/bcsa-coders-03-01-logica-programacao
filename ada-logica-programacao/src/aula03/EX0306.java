package aula03;

import static aulaUtils.Utils.lerString;

public class EX0306 {
    /*
    https://mundoeducacao.uol.com.br/matematica/formula-heron.htm
    */
    public static double calculaArea(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double area  = p * (p - a) * (p - b) * (p - c);
        area = Math.sqrt(area);
        return area;
    }

    public static void main(String[] args) {
        System.out.printf("Triângulo com lados 9, 7, e 14 tem área: %.2f.%n", calculaArea(9,7,14));
        System.out.printf("Triângulo com lados 26, 26 e 20 tem área: %.2f.%n", calculaArea(26, 26, 20));
    }
}
