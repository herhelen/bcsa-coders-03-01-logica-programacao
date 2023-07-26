package aula07;

public class A07EX01 {

    public static void main(String[] args) {
        executa("sábado", Semana.SABADO);
        executa("terça-feira", Semana.TERCA_FEIRA);
        executa("lalala", Semana.TERCA_FEIRA);
        executa("Quarta-feira", Semana.QUARTA_FEIRA);
        executa("DOM", Semana.DOMINGO);
        executa("QuiNtA", Semana.QUINTA_FEIRA);
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
