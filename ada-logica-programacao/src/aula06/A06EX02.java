package aula06;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class A06EX02 {

    public static void executa(double valorProduto, String estadoDestino, double valorEsperado) {
        try {
            double resultado = valorProdutoFinal(valorProduto, estadoDestino);
            System.out.println(resultado == valorEsperado);
        } catch (EstadoInvalidoException e) {
            System.out.println("Estado inválido!");
        }
    }

    public static void main(String[] args) {

        executa(250.10, "MG", 267.607);
        executa(250.10, "RJ", 287.615);
        executa(250.10, "SP", 280.112);
        executa(250.10, "DF", 280.112);
    }

    public static double valorProdutoFinal(double valorProduto, String estadoDestino) throws EstadoInvalidoException {

        try {
            Estado estado = Estado.valueOf(estadoDestino);
            return arredondar(valorProduto * (1 + estado.getTaxa()));
        } catch (IllegalArgumentException e) {
            throw new EstadoInvalidoException();
        }
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
