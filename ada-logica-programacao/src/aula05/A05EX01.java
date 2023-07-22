package aula05;

import static aulaUtils.Utils.lerInt;

public class A05EX01 {

    static final double PRECO_PROMOCIONAL = 1.25;
    static final double PRECO_NORMAL = 1.45;

    public static double custoCompra(double input) {
        if(input > 10) {
            return PRECO_PROMOCIONAL * input;
        }

        return PRECO_NORMAL * input;
    }

    public static int lerQuantidadeFruta(String fruta) throws QuantidadeNegativaException {
        int quantidade = lerInt(fruta + ": ");

        if(quantidade < 0) {
            throw new QuantidadeNegativaException("Quantidade fornecida para a fruta " + fruta + " é inválida.");
        }

        return quantidade;
    }

    public static double calculaPedido(String[] frutas) throws PedidoQuantidadeNulaException {
        int[] quantidadeFrutas = new int[frutas.length];
        int quantidadeTotalFrutas = 0;
        double valorFinal = 0;

        int i = 0;
        while(i < frutas.length) {
            try {
                quantidadeFrutas[i] = lerQuantidadeFruta(frutas[i]);
                valorFinal += custoCompra(quantidadeFrutas[i]);
                quantidadeTotalFrutas += quantidadeFrutas[i];
                i++;
            } catch (QuantidadeNegativaException e) {
                System.out.println(e.getMessage());
            }
        }

        if(quantidadeTotalFrutas == 0) {
            throw new PedidoQuantidadeNulaException("Não é possível fazer um pedido sem itens.");
        }

        return valorFinal;
    }

    public static void main(String[] args) {
        String[] frutas = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        double valorFinal;

        System.out.println("Frutaria da Maria. Coloque a quantidade desejada para seguinte frutas:");
        try {
            valorFinal = calculaPedido(frutas);
            System.out.printf("Valor total a ser pago é: %.2f", valorFinal);
        } catch (PedidoQuantidadeNulaException e) {
            System.out.println(e.getMessage());
        }
    }
}
