package aula04;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

public class EX0402 {
    public static void main(String[] args) {
        double[][] entradas = {
                {1, 5.0, 2000.00},
                {11, 4.5,2500.00},
                {5.1, 6.7, 4500.0},
                {1, 5.7, 4800.0},
                {10.1, 4.7, 4100.0},
                {15, 5.3, 6100.0},
                {2, 8.3, 9500.0},
                {20, 9.3, 10500.0},
                {0.5, 11.3, 4800.0},
                {5, 12.5, 6800.0},
                {10, 9.1, 8200.0}
        };

        double[] saidas = {
                2120.00,
                2662.50,
                4869.00,
                5121.60,
                4374.70,
                6545.30,
                10383.50,
                11686.50,
                5342.4,
                7752.00,
                9110.20
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = calculoSalario(entradas[i]);
            double esperado = saidas[i];

            System.out.println("entradas: " + Arrays.toString(entradas[i]));
            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static double retornaPorcentagemReajustePorTempo(double tempoAnos, double ipca) {
        double reajuste = 0.0;

        if(tempoAnos >= 1 && tempoAnos < 5) {
            reajuste = 0.01; // de 1 até 5 anos => 1%
        } else if(tempoAnos >= 5 && tempoAnos < 10) {
            reajuste = 0.015; // de 5 até 10 anos => 1.5%
        } else if(tempoAnos >= 10){
            reajuste = 0.02;
        }

        return reajuste;
    }

    public static double calculoSalario(double[] input) {
        double tempoServico = input[0];
        double ipca = input[1] / 100;
        double salarioAtual = input[2];

        // reajuste percentual de tempo de serviço
        double reajusteTempo = salarioAtual * retornaPorcentagemReajustePorTempo(tempoServico, ipca);

        // reajuste percentual da inflação
        double reajusteInflacao = salarioAtual * ipca;

        double salarioReajustado = salarioAtual + reajusteTempo + reajusteInflacao;
        salarioReajustado = arredondar(salarioReajustado);

        return salarioReajustado;
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
