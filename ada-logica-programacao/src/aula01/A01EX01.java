package aula01;

import java.util.Scanner;

public class A01EX01 {

    /*
    * Atividade 1
    * Faça um Programa que peça a temperatura em graus Fahrenheit,
    * transforme e mostre a temperatura em graus Celsius.
    * C = 5 * ((F-32) / 9).
    */

    public static double fahrenheitToCelsius(double fahrenheit) {
        return 5 * ((fahrenheit -32) / 9);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit:");

        double fahrenheit = sc.nextDouble();
        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.printf("O graus Fahrenheit %.2f em graus Celsius é %.2f.", fahrenheit, celsius);

        sc.close();
    }

}
