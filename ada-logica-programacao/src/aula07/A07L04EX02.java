package aula07;

import java.util.ArrayList;

public class A07L04EX02 {
    public static void main(String[] args) {
        System.out.println(numeroPertenceASequenciaFibonacci(4));
        System.out.println(numeroPertenceASequenciaFibonacci(0));
        System.out.println(numeroPertenceASequenciaFibonacci(8));
        System.out.println(numeroPertenceASequenciaFibonacci(1));
        System.out.println(numeroPertenceASequenciaFibonacci(52));
    }

    public static int fibonacci(int numero) {
        if(numero == 0 || numero == 1) {
            return numero;
        }

        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    public static String numeroPertenceASequenciaFibonacci(int input) {
        ArrayList<Integer> fibSeq = new ArrayList<Integer>();
        String sequencia = "";
        int fib;

        fib = -1;
        for(int i = 0; fib <= input; i++) {
            if(i == 0 || i == 1) {
                fib = i;
            } else {
                fib = fibSeq.get(i - 1) + fibSeq.get(i - 2);
            }

            if(fib <= input) {
                fibSeq.add(fib);
            }
        }

        for(int i = 0; i < fibSeq.size(); i++) {
            sequencia = sequencia + fibSeq.get(i);

            if(i < fibSeq.size() - 1) {
                sequencia = sequencia + ", ";
            }
        }

        return sequencia;
    }
}
