package aula03;

public class EX0305 {
    public static boolean elementosRepetidos(double[] input) {
        boolean achouIgual = false;
        for(int i = 0; i < input.length && !achouIgual; i++) {

            for(int j = i + 1; j < input.length; j++) {
                if(input[i] == input[j]) {
                    achouIgual = true;
                }
            }
        }

        return achouIgual;
    }

    public static void main(String[] args) {
        double[] valores = {2.5, 3.2, 4.5, 5, 6};
        double[] valores2 = {2, 2, 3.1, 4, 4.1, 4.1};
        System.out.println(elementosRepetidos(valores));
        System.out.println(elementosRepetidos(valores2));
    }
}
