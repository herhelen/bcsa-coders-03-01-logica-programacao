package aula02;

import java.util.Scanner;

public class Exercicio01Frutaria {

    static final double PRECO_PROMOCIONAL = 1.25;
    static final double PRECO_NORMAL = 1.45;

    public static double calculaValor(int quantidade) {
        if(quantidade > 10) {
            return PRECO_PROMOCIONAL * quantidade;
        }

        return PRECO_NORMAL * quantidade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frutas = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        int[] quantidadeFrutas = new int[frutas.length];

        double valorFinal = 0;

        System.out.println("Frutaria da Maria. Coloque a quantidade desejada para seguinte frutas:");
        for(int i = 0; i < frutas.length; i++){
            System.out.printf("%s: ", frutas[i]);
            quantidadeFrutas[i] = sc.nextInt();
            valorFinal += calculaValor(quantidadeFrutas[i]);
        }

        System.out.printf("Valor total a ser pago é: %.2f", valorFinal);
    }
}
