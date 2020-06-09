package ex3

class GroovyNullable {
    static void main(String[] args) {
        def user = new GroovyUser(groovyAddress: new GroovyUserAddress(city: "Kharkov"))
        println user?.groovyAddress?.city
        user = null
        println user?.groovyAddress?.city
    }
}
