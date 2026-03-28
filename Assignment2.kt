fun main(){
    // Grading system

    val marks: Double = 50

    if (marks >= 0 && marks < 30){
        println("You failed")
    }
    else if (marks => 30 && marks <= 50){
        println("Average")
    }
    else if (marks > 50 && marks <= 70){
        println("Above Average")
    }
    else if (marks > 70 && marks <= 100){
        println("You passed")
    }
    else {
        println("Invalid score")
    }

}