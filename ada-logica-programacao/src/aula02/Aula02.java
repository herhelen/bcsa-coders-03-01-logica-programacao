package aula02;

public class Aula02 {

    public static void main(String[] args) {
        int idade = 8;

        if(idade < 13) {
            System.out.println("Criança");
        } else if(idade < 18) {
            System.out.println("Adolescente");
        } else if(idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

}
