package aula03;

import static aulaUtils.Utils.*;

public class A03EX01 {

    static final double PRECO_PROMOCIONAL = 1.25;
    static final double PRECO_NORMAL = 1.45;

    public static double custoCompra(double input) {
        if(input > 10) {
            return PRECO_PROMOCIONAL * input;
        }

        return PRECO_NORMAL * input;
    }

    public static void main(String[] args) {
        String[] frutas = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        int[] quantidadeFrutas = new int[frutas.length];

        double valorFinal = 0;

        System.out.println("Frutaria da Maria. Coloque a quantidade desejada para seguinte frutas:");
        for(int i = 0; i < frutas.length; i++){
            quantidadeFrutas[i] = lerInt(frutas[i] + ": ");
            valorFinal += custoCompra(quantidadeFrutas[i]);
        }

        System.out.printf("Valor total a ser pago é: %.2f", valorFinal);
    }
}
