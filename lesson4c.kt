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

("============================================================================================")
// Below is an examle used used to calculate the BMI of a person
fun BMI (weight: Double, height: Double){
    val answer = weight / (height * height)

    println("The BMI of the person is: " + answer)
}

BMI(69.5, 1.73)

}