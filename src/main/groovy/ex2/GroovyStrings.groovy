package ex2

class GroovyStrings {
    static void main(String[] args) {
        def javaString = 'Simple Java string' // Java String
        def groovyString = "Groovy string with expression ${javaString}!" // GString

        println javaString
        println groovyString

        def bigGroovyString = """
                                  '${javaString.length()}'
                                  $groovyString
                              """

        println bigGroovyString * 3
    }
}
