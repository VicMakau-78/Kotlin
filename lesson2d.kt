// An if statement able to evaluate the scores
fun main(){
    var number = 20

   if (number > 0 && number < 30){
        println("You failed.")
    }
    else if (number >= 30 && number <= 50){
        println("Average")
    }
     else if (number > 50 && number <= 70){
        println("Above Average")
    }
     else if (number > 70 && number <= 100){
        println("Excellent")
    }
    else {
        println("Invalid input.")
    }
}