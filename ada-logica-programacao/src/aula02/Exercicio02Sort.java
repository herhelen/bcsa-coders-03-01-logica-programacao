package aula02;

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

    public static int[] selectionSort(int[] array, boolean isAscending) {
        int idx, temp;
        int[] numbers = array.clone();

        for(int i = 0; i < numbers.length; i++) {
            idx = i;

            for(int j = i + 1; j < numbers.length; j++) {
                if(isAscending) {
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

    public static int[] getNumbers(int[] array, boolean onlyEvens, boolean isAscending) {
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            if(onlyEvens && (array[i] % 2 == 0)) {
                count++;
            } else if(!onlyEvens && (array[i] % 2 != 0)) {
                count++;
            }
        }

        int[] numbers = new int[count];
        int j = 0;

        for(int i = 0; i < array.length; i++) {
            if(onlyEvens && (array[i] % 2 == 0)) {
                numbers[j++] = array[i];
            } else if(!onlyEvens && (array[i] % 2 != 0)) {
                numbers[j++] = array[i];
            }
        }

        if(isAscending) {
            return sortAscendingOrder(numbers);
        }

        return sortDescendingOrder(numbers);
    }

    public static int[] getOnlyEvenNumbers(int[] array) {
        return getNumbers(array, true, true);
    }

    public static int[] getOnlyOddNumbers(int[] array) {
        return getNumbers(array, false, true);
    }
}
