package aulaUtils;

import java.util.Scanner;

public class Utils {
    public static int lerInt(String msg) {
        Scanner sc = new Scanner(System.in);

        System.out.print(msg);
        int valor = sc.nextInt();

        sc.close();

        return valor;
    }
}
