package ex3;

public class User {
    private UserAddress userAddress;

    public User(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }
}

