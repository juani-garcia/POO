package guia.tp4.ej11;

public class InvalidIndexException extends RuntimeException{
    private static final String MESSAGE = "Invalid Index value";

    public InvalidIndexException() {
        super(MESSAGE);
    }
}

