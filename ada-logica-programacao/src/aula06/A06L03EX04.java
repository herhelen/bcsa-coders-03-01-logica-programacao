package aula06;

import java.util.Arrays;

import static aulaUtils.Utils.lerInt;

public class A06L03EX04 {

    public static void main(String[] args) {

        int termina = 0;
        int numeroUnicoEncontrado;
        int quantidadeNumeros;

        while(termina == 0) {

            System.out.println("Digite quantidade de números: ");
            quantidadeNumeros = lerInt();
            
            int[] numeros = new int[quantidadeNumeros];
            
            for(int i = 0; i < numeros.length; i++) {
                numeros[i] = lerInt();
            }

            numeroUnicoEncontrado = numeroUnico(numeros);

            System.out.printf("O número único do array %s é: %d.%n", Arrays.toString(numeros), numeroUnicoEncontrado);

            System.out.println("Digite 0 para continuar o programa: ");
            termina = lerInt();
        }

    }

    public static int numeroUnico(int[] input) {
        int idxNumeroDistinto = -1;
        boolean achouIgual;
        for(int i = 0; (i < input.length) && (idxNumeroDistinto == -1); i++) {

            achouIgual = false;
            for(int j = 0; (j < input.length) && (!achouIgual); j++) {
                if((i != j) && (input[i] == input[j])) {
                    achouIgual = true;
                }
            }

            if(!achouIgual) {
                idxNumeroDistinto = i;
            }
        }

        if(idxNumeroDistinto != -1) {
            return input[idxNumeroDistinto];
        }
        return idxNumeroDistinto;
    }
}
