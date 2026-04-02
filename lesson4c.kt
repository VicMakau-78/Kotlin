fun main(){
    // functions wth parameters
    // parameters are inputs that get passed as arguemnents when invoking a function.

    // Note: for parametetrs to work you must speify their data types

    fun greeting (name : String){
        println("hello there $name, hope you had a good day?")
    }

// When the function is invoked or called you pass as an arguement
greeting("James")
greeting("Victor")

    println("============================================================================================")
// Below is an examle used used to calculate the BMI of a person
fun BMI (weight: Double, height: Double){
    val answer = weight / (height * height)

    println("The BMI of the person is: " + answer)
}

BMI(69.5, 1.73)
BMI(96.9, 1.80)

// create a function that accepts parameters and checks whether a given number is odd or even
fun check (num1: Int){
    if(num1 % 2 == 0) print("Even") else print("Odd")
    println()
}

check(102003004)

}