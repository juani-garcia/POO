package guia.tp4.ej10;

public class TooManyFriendsException extends FriendsException{
    private static final String MESSAGE = "Too many friends";


    public TooManyFriendsException(String number) {
        super(MESSAGE, number);
    }
}
