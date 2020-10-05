package guia.tp4.ej11;

public class InvalidGradeException extends RuntimeException{
    private static final String MESSAGE = "Invalid Grade value";

    public InvalidGradeException() {
        super(MESSAGE);
    }
}
