package ex3

class GroovyNullable {
    public static void main(String[] args) {
        def user = new User(new UserAddress("Kharkov"))
        println user?.userAddress?.city
        user = null
        println user?.userAddress?.city
    }
}
