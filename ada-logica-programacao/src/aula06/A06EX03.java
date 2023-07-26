package aula06;

public class A06EX03 {

    public static void main(String[] args) {
        executa("sábado", Semana.SABADO);
        executa("terça-feira", Semana.TERCA_FEIRA);
        executa("lalala", Semana.TERCA_FEIRA);
        executa("Quarta-feira", Semana.QUARTA_FEIRA);
    }

    public static void executa(String nomeDiaSemana, Semana enumEsperado) {
        try {
            Semana enumResultado = Semana.nomeParaEnum(nomeDiaSemana);

            System.out.printf("Encontrou o enum de %s? %s (enum %s).%n",
                    nomeDiaSemana,
                    enumResultado == enumEsperado,
                    enumResultado);
        } catch (DiaDaSemanaInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
