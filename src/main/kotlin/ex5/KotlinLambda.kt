package ex5

fun main(args: Array<String>) {
    val people = listOf("Melony", "Becky", "Susan", "Tom", "Mark")
            .filter { it -> it.startsWith("M") }
            .map { it.length }
            .toCollection(arrayListOf())
    println(people)
}