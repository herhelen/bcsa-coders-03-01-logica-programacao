package aula03;

import java.util.Arrays;

import static aulaUtils.Utils.lerDouble;

public class EX0303 {
    public static double arredondamento(double valor) {

        int valorInteiro = (int) (valor * 1000.00);
        double valorArredondado = Math.round(valor * 100.00) / 100.00;

        if(valorInteiro % 5 == 0) {
            valorArredondado = Math.floor(valor * 100.00) / 100.00;
        }

        return valorArredondado;
    }

    public static double retornaPorcentagemReajustePorTempo(double tempoAnos, double ipca) {
        double reajuste = 0.0;

        if(tempoAnos >= 1 && tempoAnos < 5) {
            reajuste = 0.01; // de 1 até 5 anos => 1%
        } else if(tempoAnos >= 5 && tempoAnos < 10) {
            reajuste = 0.015; // de 5 até 10 anos => 1.5%
        } else {
//            reajuste = 0.02 * ipca; // 10 ou mais anos => 2% valor da inflação (IPCA)
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
        salarioReajustado = arredondamento(salarioReajustado);

        return salarioReajustado;
    }

    public static void main(String[] args) {
        // tempo serviço
        // valor da inflação / ipca
        // salario
        double[] valores = new double[3];
        double salarioNovo;

        for(int i = 0; i < valores.length; i++) {
            valores[i] = lerDouble();
        }

        salarioNovo = calculoSalario(valores);

        System.out.println(Arrays.toString(valores));
        System.out.println(salarioNovo);
    }
}
