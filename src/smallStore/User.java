package smallStore;

public class User {
    private String name;
    private String phone;
    private Address homeAddress;
    private String emailAddress;
    private String password;

    protected User() {
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setName(String userName) {
        name = userName;
    }

    public void setPhone(String zeroEightZero) {
        phone = zeroEightZero;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Object getHomeAddress(Address homeAddress) {
        return homeAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void setHomeAddress(String s) {
    }
}


