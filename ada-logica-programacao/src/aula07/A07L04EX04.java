package aula07;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A07L04EX04 {
    public static void main(String[] args) {
        double[] teste = {3, 20000.00, 2000.000, 250.00};
        System.out.println(salarioComComissao(teste));
    }

    final static double PORCENTAGEM_COMISSAO = 0.05;
    public static double calculaComissao(double[] input) {
        return (input[0] * input[3]) + (input[1] * PORCENTAGEM_COMISSAO);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    public static double salarioComComissao(double[] input) {
        // # de carros vendidos
        // total de venda mes
        // salario fixo
        // valor fixo por carro
        double salario = input[2] + calculaComissao(input);
        return arredondar(salario);
    }

}
