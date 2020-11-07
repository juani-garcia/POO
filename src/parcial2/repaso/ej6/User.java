package parcial2.repaso.ej6;

import java.util.HashMap;
import java.util.Map;

public class User {
    private final QuotaType quota;
    private final Map<String, UserInfo> actions;

    public User(QuotaType quota) {
        this.quota = quota;
        actions = new HashMap<>();
    }

    public boolean canGet(String date){
        return quota.canRead(actions.getOrDefault(date, new UserInfo()).reads);
    }

    public boolean canPut(String date){
        return quota.canWrite(actions.getOrDefault(date, new UserInfo()).writes);
    }

    public void addGet(String date){
        if(!canGet(date)){
            throw new RateLimitedException();
        }
        actions.putIfAbsent(date, new UserInfo());
        actions.get(date).reads++;
    }

    public void addPut(String date){
        if(!canPut(date)){
            throw new RateLimitedException();
        }
        actions.putIfAbsent(date, new UserInfo());
        actions.get(date).writes++;
    }


    private static class UserInfo{
        private int reads, writes;
    }
}
