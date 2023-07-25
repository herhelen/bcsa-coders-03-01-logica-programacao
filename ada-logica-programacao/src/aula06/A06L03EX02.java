package aula06;

import java.util.Arrays;

import static aulaUtils.Utils.lerInt;

public class A06L03EX02 {

    public static void main(String[] args) {

        int termina = 0;
        int[] lados = new int[3];
        boolean ehTriangulo;

        while(termina == 0) {

            for(int i = 0; i < lados.length; i++) {
                lados[i] = lerInt();
            }

            ehTriangulo = eUmTriangulo(lados);

            System.out.printf("Os lados %s formam triângulo? %s.%n", Arrays.toString(lados), ehTriangulo);

            System.out.println("Digite 0 para continuar o programa: ");
            termina = lerInt();
        }

    }

    public static boolean verificaDesigualdadeTriangular(int x, int y, int z) {
        return (y + z) > x;
    }

    public static boolean eUmTriangulo(int[] input) {
        return
            verificaDesigualdadeTriangular(input[0], input[1], input[2]) &&
            verificaDesigualdadeTriangular(input[1], input[0], input[2]) &&
            verificaDesigualdadeTriangular(input[2], input[0], input[1]);
    }
}
