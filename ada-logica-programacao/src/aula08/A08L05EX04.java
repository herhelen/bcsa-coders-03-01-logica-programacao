package aula08;

import java.util.Arrays;

public class A08L05EX04 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(soletrandoInvertidoStr("amor")));
        System.out.println(Arrays.toString(soletrandoInvertidoStr("carro")));
        System.out.println(Arrays.toString(soletrandoInvertidoStr("2002")));
    }

    public static String[] soletrandoInvertidoStr(String input) {
        String[] soletradoInvertido = new String[input.length()];

        int j = 0;
        for(int i = input.length() - 1; i >= 0; i--) {
            soletradoInvertido[j++] = input.charAt(i) + "";
        }

        return soletradoInvertido;
    }
}
