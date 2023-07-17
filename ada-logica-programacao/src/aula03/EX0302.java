package aula03;

import java.util.Arrays;
import static aulaUtils.Utils.*;

public class EX0302 {

    public static double arredondamento(double valor) {

        int valorInteiro = (int) (valor * 1000.00);
        double valorArredondado = Math.round(valor * 100.00) / 100.00;

        if(valorInteiro % 5 == 0) {
            valorArredondado = Math.floor(valor * 100.00) / 100.00;
        }

        return valorArredondado;
    }

    public static double[] custosCarro(double[] input) {
        double precoFinalFabrica = input[0];
        double[] percentuais = new double[2];

        // calculo do percentual do custo dodistribuidor
        percentuais[0] = (input[1] / precoFinalFabrica) * 100.00;
        percentuais[0] = arredondamento(percentuais[0]);

        // calculo do percentual do custo com os impostos
        percentuais[1] = (input[2] / precoFinalFabrica) * 100.00;
        percentuais[1] = arredondamento(percentuais[1]);

        return percentuais;
    }

    public static void main(String[] args) {
        double[] valores = new double[3];
        double[] percentuais = new double[2];

        for(int i = 0; i < valores.length; i++) {
            valores[i] = lerDouble();
        }

        percentuais = custosCarro(valores);

        System.out.println(Arrays.toString(valores));
        System.out.println(Arrays.toString(percentuais));
    }
}
