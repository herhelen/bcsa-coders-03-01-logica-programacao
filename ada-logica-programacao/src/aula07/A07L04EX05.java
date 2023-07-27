package aula07;

import java.util.Arrays;

public class A07L04EX05 {
    public static void main(String[] args) {
        int[] teste = {0,6};
        System.out.println(parImpar(teste));
    }

    public static String formataRetorno(int qtd, String singular, String plural) {
        if(qtd == 1) {
            return qtd + " " + singular;
        } else if (qtd > 1 || qtd == 0) {
            return qtd + " " + plural;
        }

        return "";
    }

    public static String parImpar(int[] input) {
        int qtdePar = 0;
        int qtdeImpar = 0;
        String retorno;

        for(int i = 0; i < input.length; i++) {
            if(input[i] % 2 == 0) {
                qtdePar++;
            } else {
                qtdeImpar++;
            }
        }

        retorno = formataRetorno(qtdePar, "par", "pares");
        retorno += ", " ;
        retorno += formataRetorno(qtdeImpar, "ímpar", "ímpares");

        return retorno;
    }

}
