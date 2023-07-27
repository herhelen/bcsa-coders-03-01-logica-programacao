package aula07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A07L04EX01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(soletrandoStr("amor")));
    }

    public static String[] soletrandoStr(String input) {
        String[] soletrado = new String[input.length()];

        for(int i = 0; i < soletrado.length; i++) {
            soletrado[i] = input.charAt(i) + "";
        }

        return soletrado;
    }
}
