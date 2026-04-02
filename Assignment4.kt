fun main(){
    // Create a function that acceps parameter that is able to do conversion of degree celsius into farenheit.

fun celsiusToFahrenheit(celsius: Double) {
    val fahrenheit = (celsius * 9/5) + 32
    println("$celsius = $fahrenheit")
}

celsiusToFahrenheit(25.0)
celsiusToFahrenheit(100.0)

// Create a function that is able to calculate the compound interest of a person.

fun compoundInterest(principal: Double, rate: Double, time: Double, n: Double) {
    val amount = principal * Math.pow((1 + (rate / 100) / n), (n * time))
    val interest = amount - principal
    
    println("Principal: $principal")
    println("Amount: $amount")
    println("Compound Interest: $interest")
}

compoundInterest(1000.0, 5.0, 2.0, 4.0)  // P=1000, R=5%, T=2 years, n=4 (quarterly)

// Research on inheritance in kotlin. Come up with an example of a program.

// Parent class
open class Animal(val name: String, val age: Int) {
    open fun sound() {
        println("$name makes a sound")
    }
    
    fun sleep() {
        println("$name is sleeping")
    }
}

// Child class inheriting from Animal
class Dog(name: String, age: Int, val breed: String) : Animal(name, age) {
    override fun sound() {
        println("$name barks: Woof! Woof!")
    }
    
    fun fetch() {
        println("$name is fetching the ball")
    }
}

// Child class inheriting from Animal
class Cat(name: String, age: Int, val color: String) : Animal(name, age) {
    override fun sound() {
        println("$name meows: Meow! Meow!")
    }
}

fun main() {
    val dog = Dog("Buddy", 5, "Golden Retriever")
    dog.sound()
    dog.fetch()
    
    val cat = Cat("Whiskers", 3, "Orange")
    cat.sound()
    cat.sleep()
}



}