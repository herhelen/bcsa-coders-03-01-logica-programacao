package aula08;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A08L05EX05 {

    public static void main(String[] args) {
        double[] input = {4.0, 50.00, 1.0};
        System.out.println(valorEntrada(input));
    }

    public static double retornaDescontoDiaDaSemana(double dia) {
        if(dia == 1.0 || dia == 2.0 || dia == 4.0) {
            return 0.75; // 25% de desconto
        }
        return 1.0;
    }

    public static double retornaTaxaMusicaAoVivo(double musicaAoVivo) {
        if(musicaAoVivo == 1.0) {
            return 0.15;
        }

        return 0.0;
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.###", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    // 25% desconto na entrada - seg, ter, qui
    // 15% acrescido na entrada - música ao vivo
    // preço entrada, dia da semana, ao vivo (sim 1 ou não 2)
    public static double valorEntrada(double[] input) {
        double desconto = retornaDescontoDiaDaSemana(input[0]);
        double entrada = input[1];
        double taxa = retornaTaxaMusicaAoVivo(input[2]);

        double valorEntradaFinal = entrada * desconto;
        valorEntradaFinal += valorEntradaFinal * taxa;

        return arredondar(valorEntradaFinal);
    }
}
