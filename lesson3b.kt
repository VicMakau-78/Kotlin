fun main(){
    // looping from a higher number to a lower number by use of a for loop
    // create a program that is able to print from 10 to 1 
    // Using the downTo keyword
    for (y in 10 downTo 1){
        println("The count is: $y")
    }
    
    println("=====================================================")
    
    // show odd numbers from 20 down to 10
    for (x in 20 downTo 10 step 2){
        if(x % 2 != 0)
        println(x)
    }
}