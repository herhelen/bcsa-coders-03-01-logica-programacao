package aula03;

import static aulaUtils.Utils.lerString;

public class EX0306 {
    /*
    https://mundoeducacao.uol.com.br/matematica/formula-heron.htm

    Agora, verificar se é um triângulo antes de fazer o cálculo da área

    um de seus lados deve ser maior que o valor absoluto (módulo) da
    diferença dos outros dois lados e menor que a soma dos outros dois lados.
    a > |b - c| && a < b + c
    */

    public static boolean verificaDesigualdadeTriangular(int x, int y, int z) {
        return (x > Math.abs(y - z)) && (x < (y + z));
    }

    public static boolean ehTriangulo(int a, int b, int c) {
        return
                verificaDesigualdadeTriangular(a, b, c) ||
                verificaDesigualdadeTriangular(b, a, c) ||
                verificaDesigualdadeTriangular(c, a, b);
    }

    public static double calculaArea(int a, int b, int c) {
        if(ehTriangulo(a, b, c)) {
            double p = (a + b + c) / 2;
            double area  = p * (p - a) * (p - b) * (p - c);
            area = Math.sqrt(area);
            return area;
        }

        return 0.0;
    }

    public static void main(String[] args) {
        System.out.printf("Triângulo com lados 9, 7, e 14 tem área: %.2f.%n", calculaArea(9,7,14));
        System.out.printf("Triângulo com lados 26, 26 e 20 tem área: %.2f.%n", calculaArea(26, 26, 20));
        System.out.printf("Triângulo com lados 20, 15 e 5 tem área: %.2f.%n", calculaArea(20, 15, 5));
    }
}
