fun main(){
    // for loop 
    // it is used to execute a block of code/statement aaa number of times until a condition is met

    for (number in 1..30){
        println("The count is: $number")
    }

    println("=====================================================")

    // create a for loop that is able to print from 50 to 65
    for (x in 50..65){
        println("The count is: $x")
    }

    println("=====================================================")

    // Research on how to increment on the for loop by use of steps
    for (y in 20..40 step 5){
        println(y)
    }

    println("=====================================================")

    // Below we find the odd numbers in the given range
    for (z in 20..40){
        if (z % 2 != 0){
            println(z)
        }
    }

    println("=====================================================")
    // by use of a for loop, generate the multiplication  table for 5 from 1 to 5.
    for (a in 1..5){
        val prod = a * 5
        println("5 * $a = $prod")
    }

    println("=====================================================")

    // create a program that is able to find the factorial of number 5

    var factorial = 1
    for (b in 1..5){
        factorial *= b
    }
    println("The factorial of 5 is: $factorial")
}


// Check on difference between local variables and global variables

