package aula07;

import java.util.Arrays;

public class A07L04EX03 {
    public static void main(String[] args) {
        int[] teste = {5,6,9,7,0,10};
        System.out.println(Arrays.toString(ordenar(teste)));
    }

    public static int[] ordenar(int[] input) {
        int idx, temp;
        int[] inputOrdenado = input.clone();

        for(int i = 0; i < inputOrdenado.length; i++) {
            idx = i;

            for(int j = i + 1; j < inputOrdenado.length; j++) {
                if(inputOrdenado[j] < inputOrdenado[idx]) {
                    idx = j;
                }
            }

            temp = inputOrdenado[i];
            inputOrdenado[i] = inputOrdenado[idx];
            inputOrdenado[idx] = temp;
        }

        return inputOrdenado;
    }

}
