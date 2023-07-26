package aula06;

public class DiaDaSemanaInvalidoException extends Exception {
    public DiaDaSemanaInvalidoException() {
        super();
    }
    public DiaDaSemanaInvalidoException(String dia) {
        super(dia + " não é um dia da semana válido.");
    }
}