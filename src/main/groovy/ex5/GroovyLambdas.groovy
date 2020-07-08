package ex5

import java.util.stream.Collectors

class GroovyLambdas {
    static void main(String[] args) {

        def people = ["Martin", "Becky", "Susan", "Tom", "Mary"]
        println people.stream()
                .filter(it -> it.startsWith("M"))
                .map(String::length)
                .collect(Collectors.toList())

        print people.findAll({ it -> it.startsWith("M") })
                .collect(it -> it.length())
    }
}
