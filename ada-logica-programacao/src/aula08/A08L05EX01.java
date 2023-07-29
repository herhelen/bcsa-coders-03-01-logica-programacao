package aula08;

public class A08L05EX01 {
    public static void main(String[] args) {
        System.out.println(somaAlgarismos(231) == 6);
        System.out.println(somaAlgarismos(235) == 10);
        System.out.println(somaAlgarismos(121) == 4);
        System.out.println(somaAlgarismos(0) == -1);
        System.out.println(somaAlgarismos(-5) == -1);
    }

    public static int somaAlgarismos(int input) {
        if(input <= 0) {
            return -1;
        }

        int algarismo = input % 10;
        int restanteNumero = input / 10;

        if(restanteNumero > 0) {
            return somaAlgarismos(restanteNumero) + algarismo;
        }
        return algarismo;
    }
}
