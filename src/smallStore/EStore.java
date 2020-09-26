package smallStore;

import java.util.ArrayList;
import java.util.List;

public class EStore {
    private String estoreName;
    private List<User> registeredUsers = new ArrayList<>();

    public String getEStoreName() {
        return estoreName;
    }

    public void setEStoreName(String estoreName) {
        this.estoreName = estoreName;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public void registerUser(User newUser) {
        registeredUsers.add(newUser);
    }

    @Override
    public String toString() {
        return "EStore{" +
                "estoreName='" + estoreName + '\'' +
                ", registeredUsers=" + registeredUsers +
                '}';
    }
}

