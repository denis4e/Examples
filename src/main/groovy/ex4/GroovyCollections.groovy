package ex4

class GroovyCollections {
    def collections() {
        //Map
        def map = [age: 30, name: 'Tom', married: true]
        List list = ["Mary", "Becky", "Susan", "Tom", "Mary"]
        String[] array = ["Mary", "Becky", "Susan", "Tom", "Mary"]

        def unmodifiableMap = map.asUnmodifiable()
        def immutableMap = map.asImmutable()

    }
}
