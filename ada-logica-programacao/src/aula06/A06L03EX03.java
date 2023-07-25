package aula06;

import java.util.Arrays;

import static aulaUtils.Utils.lerInt;

public class A06L03EX03 {

    public static void main(String[] args) {

        int termina = 0;
        int[] idadeAnosMesesDias = new int[3];
        int idadeDias;

        while(termina == 0) {

            for(int i = 0; i < idadeAnosMesesDias.length; i++) {
                idadeAnosMesesDias[i] = lerInt();
            }

            idadeDias = idadeEmDias(idadeAnosMesesDias);

            System.out.printf("A idade %s em dias é %d.%n", Arrays.toString(idadeAnosMesesDias), idadeDias);

            System.out.println("Digite 0 para continuar o programa: ");
            termina = lerInt();
        }

    }

    static final int ANO_EM_DIAS = 365;
    static final int MES_EM_DIAS = 30;

    public static int idadeEmDias(int[] input) {
        return (input[0] * ANO_EM_DIAS) + (input[1] * MES_EM_DIAS) + input[2];
    }
}
