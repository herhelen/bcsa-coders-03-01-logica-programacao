package aulaUtils;

import java.util.Scanner;

public class Utils {

    public static int lerInt() {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        sc.nextLine();

        return valor;
    }

    public static int lerInt(String msg) {
        Scanner sc = new Scanner(System.in);

        System.out.print(msg);
        int valor = sc.nextInt();
        sc.nextLine();

        return valor;
    }

    public static double lerDouble() {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        sc.nextLine();

        return valor;
    }

    public static double lerDouble(String msg) {
        Scanner sc = new Scanner(System.in);

        System.out.print(msg);
        double valor = sc.nextDouble();
        sc.nextLine();

        return valor;
    }

    public static String lerString() {
        Scanner sc = new Scanner(System.in);

        String valor = sc.nextLine();

        return valor;
    }

    public static String lerString(String msg) {
        Scanner sc = new Scanner(System.in);

        System.out.print(msg);
        String valor = sc.nextLine();

        return valor;
    }
}
