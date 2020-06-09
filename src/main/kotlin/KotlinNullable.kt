import ex3.User
import ex3.UserAddress

fun main() {
    var user: User? = User(UserAddress("Kharkiv"))
    println(user?.userAddress?.city)
    user = null
    println(user?.userAddress?.city)
}