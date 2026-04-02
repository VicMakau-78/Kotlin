class Person{
        // Attributes/ characteristics/ properties of a person
        var name = "James"
        var age = 45

        // Behaviours/functions/actions/doables
        fun walk(){
            println("The person can walk")
        }
        fun speak(){
            println("The person can speak...")
        }
}

fun main(){
    // objects is a real world thing 
    // An object is intanciated/created/obtaained/emanated from class
    // For us to be able to either access the properties or behaviours of a class we require to have an object
    
    // Below we create an object
    var myObject = Person()

    // Below we use the dot separator to access either the function or the properties

    myObject.walk()

    println("The age of the person is: " + myObject.age)

}