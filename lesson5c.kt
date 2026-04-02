// Inheritance is whereby a child class obtains the properties and behaviours of another class (Parent class)

open class Animal {
    // properties
    var name = "Name"

    // behaviours of the animal
    fun walk(){
        println("The animal can walk")

    }
    fun sleep(){
        println("The animal can sleep")
    }
}
// Below class inherits from the super/parent class Animal
class Dog : Animal (){
    fun bark(){
        println("The dog likes barking...")
    }
}

fun main(){
    // create an object
    var myDog = Dog()

    // Accessing the behaviours of the dog

    myDog.bark()
    myDog.sleep()
    myDog.walk()
}