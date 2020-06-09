package ex1;

public class UserJava {
    private String name;

    public UserJava() {
    }

    public UserJava(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        UserJava user = new UserJava();
//        user.setName("Denis");
//        System.out.println(user);

//        UserGroovy userGroovy = new UserGroovy();
//        userGroovy.setName("Denis");
//        System.out.println(userGroovy);
//
//        UserKotlin userKotlin = new UserKotlin();
//        userKotlin.setName("Denis");
//        System.out.println(userKotlin);

        UserJava userJava = new UserJava();
        userJava.setName("Denys");
        System.out.println(userJava);

    }
}
