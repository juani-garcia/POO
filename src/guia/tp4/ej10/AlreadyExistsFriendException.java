package guia.tp4.ej10;

public class AlreadyExistsFriendException extends FriendsException{
    private static final String MESSAGE = "Friend already exists";

    public AlreadyExistsFriendException(String number) {
        super(MESSAGE, number);
    }
}
