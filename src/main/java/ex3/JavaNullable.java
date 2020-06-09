package ex3;

public class JavaNullable {
    public static void main(String[] args) {
        User user = new User(new UserAddress("Kharkiv, Peremogi 36"));
        var city = "";

        if (user != null) {
            if (user.getUserAddress() != null) {
                if (user.getUserAddress().getCity() != null) {
                    city = user.getUserAddress().getCity();
                }
            }
        }

        System.out.println(city);
    }
}
