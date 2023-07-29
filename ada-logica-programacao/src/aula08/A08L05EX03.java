package aula08;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A08L05EX03 {

    public static void main(String[] args) {
        double[] input = {22.1, 5};
        System.out.println(valorProdutoFinal(input));
    }

    // (MG 7%; SP 12%; RJ 15%;)
    // 1.0 => MG, 2.0 => SP, 3.0 => RJ
    // Fazer um arredondamento de 4 casas no valor final do produto

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    public static double retornaTaxa(double estado) {
        if(estado == 1.0) {
            return 0.07;
        } else if(estado == 2.0) {
            return 0.12;
        } else if(estado == 3.0) {
            return 0.15;
        }
        return -1.0;
    }

    public static double valorProdutoFinal(double[] input) {
        double taxa = 1 + retornaTaxa(input[1]);
        if(taxa > 0) {
            return arredondar(input[0] * taxa);
        }
        return -1.0;
    }
}
