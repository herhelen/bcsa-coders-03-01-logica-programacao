package aula06;

public class EstadoInvalidoException extends Exception {

    public EstadoInvalidoException() {
        super();
    }
    public EstadoInvalidoException(String message) {
        super(message);
    }
}