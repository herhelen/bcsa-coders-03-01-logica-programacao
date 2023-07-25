package aula06;

import java.util.Arrays;

import static aulaUtils.Utils.*;

public class A06L03EX01 {

    public static void main(String[] args) {

        int termina = 0;
        double[] notas = new double[4];
        String conceito;

        while(termina == 0) {

            for(int i = 0; i < notas.length; i++) {
                notas[i] = lerDouble();
            }

            conceito = mediaAproveitamento(notas);

            System.out.printf("Para as notas %s o conceito é %s.%n", Arrays.toString(notas), conceito);

            System.out.println("Digite 0 para continuar o programa: ");
            termina = lerInt();
        }

    }

    public static String mediaAproveitamento(double[] input) {
        double media = input[0] + (input[1] * 2) + (input[2] * 3) + input[3];
        media = media / 7;

        return retornaConceito(media);
    }

    public static String retornaConceito(double media) {
        if(media >= 9.0) {
            return "A";
        } else if(media >= 7.5 && media < 9.0) {
            return "B";
        } else if(media >= 6.0 && media < 7.5) {
            return "C";
        } else if(media < 6.0) {
            return "D";
        }
        return "";
    }

}
