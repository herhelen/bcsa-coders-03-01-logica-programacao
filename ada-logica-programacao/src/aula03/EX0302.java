package aula03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import static aulaUtils.Utils.*;

public class EX0302 {

    public static double arredondamento(double valor) {

        double valorArredondado = new BigDecimal(valor * 100.0 / 100.0)
                .setScale(3, RoundingMode.DOWN)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();

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
