package ex1

//class UserKotlin(name: String) {
class UserKotlin {
    //    constructor(name: String)
    var name: String = ""

    override fun toString(): String {
        return "User $name"
    }
}

fun main() {
//    var user= UserKotlin("Denys")
//    user.name="Ivan"
    var user = UserKotlin()
    println(user)
}