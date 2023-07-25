package aula06;

import java.util.Arrays;

import static aulaUtils.Utils.lerDouble;
import static aulaUtils.Utils.lerInt;

public class A06L03EX05 {

    public static void main(String[] args) {

        int termina = 0;
        int quantidadePecas;
        String recibo;

        while(termina == 0) {

            System.out.println("Digite quantidade de peças: ");
            quantidadePecas = lerInt();

            double[] precos = new double[quantidadePecas];

            for(int i = 0; i < precos.length; i++) {
                precos[i] = lerDouble();
            }

            recibo = avaliacao(precos);

            System.out.printf("O recibo das peças %s é:%n%s%n", Arrays.toString(precos), recibo);

            System.out.println("Digite 0 para continuar o programa: ");
            termina = lerInt();
        }
    }

    public static double calculaValorTotal(double[] input) {
        double valorTotal = 0.0;

        for (double preco: input) {
            valorTotal += preco;
        }

        return valorTotal;
    }

    public static String avaliacao(double[] input) {
        double valorDesconto = 0.0;
        double menorValorDeDois = 0.0;

        int tamanho = input.length % 2 == 0 ? input.length : input.length - 1;
        for(int i = 0; i < tamanho; i += 2) {
            menorValorDeDois = input[i] < input[i + 1] ? input[i] : input[i + 1];
            valorDesconto = valorDesconto + (menorValorDeDois * 0.5);
        }

        double valorTotal = calculaValorTotal(input);
        double valorAPagar = valorTotal - valorDesconto;

        String retorno = "Valor total: " + valorTotal;
        retorno = retorno + " | Valor de descontos: " + valorDesconto;
        retorno = retorno + " | Valor a pagar: " + valorAPagar;

        return retorno;
    }
}
