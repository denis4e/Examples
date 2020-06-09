package ex1

class UserGroovy {
    def name

    @Override
    String toString() {
        return "User $name"
    }

    static void main(def args) {
//        def user= new UserGroovy();
//        user.name("Denys")
//        user.setName("Ivan")
        def user = new UserGroovy(name: 'Denys')
        println user
    }
}
