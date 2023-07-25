package aula06;

public class A06EX03 {

    public static void main(String[] args) {
        executa("sábado", Semana.SABADO);
        executa("terça-feira", Semana.TERCA_FEIRA);
        executa("lalala", Semana.TERCA_FEIRA);
    }

    public static void executa(String nomeDiaSemana, Semana enumEsperado) {
        Semana enumResultado = Semana.nomeParaEnum(nomeDiaSemana);

        System.out.printf("Encontrou o enum do dia %s? %s (enum %s).%n", nomeDiaSemana, enumResultado == enumEsperado,
                enumResultado);
    }
}
