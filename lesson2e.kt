// when statement
// the when statemnent in kotlin is like a switch case in other languages. It checks a value against multiple conditions and executes the matching block.
 fun main(){
    val marks = 7

    when (marks){
        in 1.. 30 -> println("You failed")
        in 31.. 50 -> println("Average")
        in 51.. 70 -> println("Above average")
        in 71.. 100 -> println("You passed")
        else -> println("Invalid scores")
    }
 }