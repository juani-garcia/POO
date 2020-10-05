package guia.tp4.ej10;

public class FriendsException extends Exception{


    public FriendsException(String message, String number) {
        super(String.format("Error in number %s: %s", number, message));
    }
}
