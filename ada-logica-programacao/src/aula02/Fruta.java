package aula02;

import java.util.Scanner;

public class Fruta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frutas = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        int[] quantidadeFrutas = new int[frutas.length];
        final double PRECO_PROMOCIONAL = 1.25;
        final double PRECO_NORMAL = 1.45;
        double valorFinal = 0;

        System.out.println("Frutaria da Maria. Coloque a quantidade desejada para seguinte frutas:");
        for(int i = 0; i < frutas.length; i++){
            System.out.printf("%s: ", frutas[i]);
            quantidadeFrutas[i] = sc.nextInt();
            if(quantidadeFrutas[i] > 10) {
                valorFinal += PRECO_PROMOCIONAL * quantidadeFrutas[i];
            } else {
                valorFinal += PRECO_NORMAL * quantidadeFrutas[i];
            }
        }

        System.out.printf("Valor total a ser pago é: %.2f", valorFinal);
    }
}
