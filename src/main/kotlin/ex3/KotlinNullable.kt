package ex3


fun main() {
    var user: KotlinUser? = KotlinUser(KotlinUserAddress("Kharkiv"))
    println(user?.userAddress?.city)
    user = null
    println(user?.userAddress?.city)
}