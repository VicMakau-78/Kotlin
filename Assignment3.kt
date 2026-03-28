// page 26 of kotlin
// Research on the looping structures in kotlin, how to create an array in kotlin
// 1. Using if statements or when statement, create a program to find if given year is leap or not
// 2. Using if statements check if a given number is ODD or Even

fun main(){
    val year = 2024
    
    // Check if the year is a leap year
    if (year % 400 == 0) {
        println("$year is a leap year")
    }
    else if (year % 100 == 0) {
        println("$year is not a leap year")
    }
    else if (year % 4 == 0) {
        println("$year is a leap year")
    }
    else {
        println("$year is not a leap year")
    }
}