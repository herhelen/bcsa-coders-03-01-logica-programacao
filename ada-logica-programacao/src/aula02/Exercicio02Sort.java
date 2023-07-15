package aula02;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio02Sort {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);
        int[] evenNumbers = getOnlyEvenNumbers(numbers);
        int[] oddNumbers = getOnlyOddNumbers(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
    }

    public static int[] selectionSort(int[] array, boolean isAsceding) {
        int idx, temp;
        int[] numbers = array.clone();

        for(int i = 0; i < numbers.length; i++) {
            idx = i;

            for(int j = i + 1; j < numbers.length; j++) {
                if(isAsceding) {
                    if(numbers[j] < numbers[idx]) {
                        idx = j;
                    }
                } else {
                    if(numbers[j] > numbers[idx]) {
                        idx = j;
                    }
                }
            }

            temp = numbers[i];
            numbers[i] = numbers[idx];
            numbers[idx] = temp;
        }

        return numbers;
    }

    public static int[] sortAscendingOrder(int[] array) {
        return selectionSort(array, true);
    }

    public static int[] sortDescendingOrder(int[] array) {
        return selectionSort(array, false);
    }

    public static int[] getOnlyEvenNumbers(int[] array) {
        int countEvenNumbers = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }

        int[] numbers = new int[countEvenNumbers];
        int j = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                numbers[j++] = array[i];
            }
        }

        return sortAscendingOrder(numbers);
    }

    public static int[] getOnlyOddNumbers(int[] array) {
        int countOddNumbers = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                countOddNumbers++;
            }
        }

        int[] numbers = new int[countOddNumbers];
        int j = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                numbers[j++] = array[i];
            }
        }

        return sortAscendingOrder(numbers);
    }
}
