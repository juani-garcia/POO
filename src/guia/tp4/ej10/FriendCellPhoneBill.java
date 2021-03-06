package guia.tp4.ej10;

public class FriendCellPhoneBill extends CellPhoneBill {

    private String[] friends;
    private int friendsIndex;
    private int friendsLimit;
    private double cost;

    private static final double DEFAULT_FRIEND_COST_PER_SECOND = 0;

    FriendCellPhoneBill(String number, int limit) {
        super(number);
        this.friends = new String[limit];
        this.friendsLimit = limit;
        this.cost = DEFAULT_FRIEND_COST_PER_SECOND;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void addFriend(String number) throws TooManyFriendsException, AlreadyExistsFriendException{
        if(friendsIndex == friendsLimit)
            throw new TooManyFriendsException(number);

        if(containsFriend(number))
            throw new AlreadyExistsFriendException(number);

        friends[friendsIndex++] = number;
    }

    private boolean containsFriend(String number) {
        for(int i = 0; i < friendsIndex; i++) {
            if(friends[i].compareTo(number) == 0) {
                return true;
            }
        }
        return false;
    }

    public void removeFriend(String number) throws FriendNotFoundException{
        for(int i = 0; i < friendsIndex; i++) {
            if(friends[i].compareTo(number) == 0) {
                friends[i] = friends[--friendsIndex];
                return;
            }
        }
        throw new FriendNotFoundException(number);
    }

    @Override
    public double processBill() {
        double total = 0;
        for (int i = 0; i < callsIndex; i++) {
            boolean friendlyCall = false;
            for(int j = 0; j < friendsIndex && !friendlyCall; j++) {
                if (calls[i].getTo().compareTo(friends[j]) == 0) {
                    friendlyCall = true;
                }
            }
            total += friendlyCall ? calls[i].getCost() * cost : calls[i].getCost();
        }
        return total;
    }

}