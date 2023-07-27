package aula07;

public class A07EX02 {

    public static void main(String[] args) {
        System.out.println(fatorial(0) == fatorialRecursivo(0));
        System.out.println(fatorial(1) == fatorialRecursivo(1));
        System.out.println(fatorial(5) == fatorialRecursivo(5));
    }

    public static int fatorial(int numero) {
        int resultado = 1;
        for(int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int numero) {
        if(numero == 0 || numero == 1) {
            return 1;
        }

        return numero * fatorialRecursivo(numero - 1);
    }
}
