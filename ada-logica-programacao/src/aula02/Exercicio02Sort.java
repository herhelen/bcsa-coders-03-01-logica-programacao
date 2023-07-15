package aula02;

import java.util.Arrays;

public class Exercicio02Sort {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
    }

    public static int[] sortAscendingOrder(int[] array) {
        int idxSmallest, temp;
        int[] numbers = array.clone();

        for(int i = 0; i < numbers.length; i++) {
            idxSmallest = i;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[idxSmallest]) {
                    idxSmallest = j;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[idxSmallest];
            numbers[idxSmallest] = temp;
        }

        return numbers;
    }

    public static int[] sortDescendingOrder(int[] array) {
        int idxLargest, temp;
        int[] numbers = array.clone();

        for(int i = 0; i < numbers.length; i++) {
            idxLargest = i;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] > numbers[idxLargest]) {
                    idxLargest = j;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[idxLargest];
            numbers[idxLargest] = temp;
        }

        return numbers;
    }
}
