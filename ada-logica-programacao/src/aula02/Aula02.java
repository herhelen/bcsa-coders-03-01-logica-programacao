package aula02;

public class Aula02 {

    public static void main(String[] args) {
        int idade = 8;

        System.out.println(retornaFaixaEtaria(idade));
    }

    public static String retornaFaixaEtaria(int idade) {
        if(idade < 13) {
            return "Criança";
        } else if(idade < 18) {
            return "Adolescente";
        } else if(idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }

}
