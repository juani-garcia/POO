package guia.tp4.ej10;

public class FriendNotFoundException extends FriendsException{
    private static final String MESSAGE = "Friend not found";

    public FriendNotFoundException(String number) {
        super(MESSAGE, number);
    }
}
