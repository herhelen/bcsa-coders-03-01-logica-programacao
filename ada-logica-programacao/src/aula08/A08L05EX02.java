package aula08;

import java.util.Arrays;

public class A08L05EX02 {

    public static void main(String[] args) {
        String[] input = {"carro","cah", "paz", "pá"};
        String[] subStrs = substringStr(input);
        System.out.println(Arrays.toString(subStrs));
    }

    public static boolean verificaEhSubStr(String subStr, String str) {
        for(int i = 0; i < str.length(); i++) {
            int j = 0;
            int tempI = i;

            while(j < subStr.length() && tempI < str.length() && str.charAt(tempI) == subStr.charAt(j)) {
                j++;
                tempI++;
            }

            if(j == subStr.length()) {
                return true;
            }
        }

        return false;
    }

    public static String[] substringStr(String[] input) {
        int tamanho = input.length;
        boolean[] ehSubStr = new boolean[tamanho];

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {
                if(i != j) {
                    ehSubStr[i] =
                            ehSubStr[i] ||
                            verificaEhSubStr(input[i], input[j]);
                }
            }
        }

        int tamanhoRetorno = 0;
        for (boolean boolEhSubStr: ehSubStr) {
            if(boolEhSubStr) {
                tamanhoRetorno++;
            }
        }

        String[] subStrs = new String[tamanhoRetorno];

        int j = 0;
        for(int i = 0; i < ehSubStr.length; i++) {
            if(ehSubStr[i]) {
                subStrs[j++] = input[i];
            }
        }

        return subStrs;
    }
}
