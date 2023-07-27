package aula07;

public class A07EX02 {

    public static void main(String[] args) {
        System.out.println(multiplicarRecursivo(5));
    }

    public static int multiplicarRecursivo(int limite) {
        if(limite == 1) {
            return 1;
        }

        return limite * multiplicarRecursivo(limite - 1);
    }
}
