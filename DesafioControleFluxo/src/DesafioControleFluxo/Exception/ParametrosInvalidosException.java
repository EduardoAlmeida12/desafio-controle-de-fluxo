package DesafioControleFluxo.Exception;

public class ParametrosInvalidosException extends IllegalArgumentException {
    public ParametrosInvalidosException() {
        super("Parametro  Invalido");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
