package ex4

fun collections() {
    //immutable
    val immutableList: List<String> = listOf("Anne", "Karen", "Peter")
    val immutableMap = mapOf("a" to 1, "b" to 2, "c" to 3)
    val immutableSet = setOf("a", "b", "c")

    //mutable
    val modifiableList = mutableListOf("Anne", "Karen", "Peter")
    val modifiableMap = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val modifiableSet = mutableSetOf("a", "b", "c")
}
