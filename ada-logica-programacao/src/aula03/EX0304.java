package aula03;

import java.util.Arrays;

import static aulaUtils.Utils.lerDouble;
import static aulaUtils.Utils.lerString;

public class EX0304 {
    public static int primeiroCaractereUnico(String input) {
        int idxPrimeiroCharUnico = -1;
        boolean achouIgual;
        for(int i = 0; i < input.length() && idxPrimeiroCharUnico == -1; i++) {

            achouIgual = false;
            for(int j = i + 1; j < input.length() && !achouIgual; j++) {
                if(input.charAt(i) == input.charAt(j)) {
                    achouIgual = true;
                }
            }

            if(!achouIgual) {
                idxPrimeiroCharUnico = i;
            }
        }

        return idxPrimeiroCharUnico;
    }

    public static void main(String[] args) {
        String word = lerString();
        System.out.println(word);
        System.out.println(primeiroCaractereUnico(word));
    }
}
