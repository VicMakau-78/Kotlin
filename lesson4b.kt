fun main(){
    // below is a funv=cton that is able to add two numbers

    fun addition(){
        val num1 = 30
        val num2 = 20
        val sum = num1 + num2

        print("The sum of the numbers is: $sum")
    }

    addition()

    println("============================================================================================")

    // create a function that is able to multiply three numbers

    fun product(){
        val p = 30000
        val r = 0.15
        val t = 4
        val sum = p * r * t
    }
    product()
    println("============================================================================================")

    // Given two numbers, create a function that is able to find the largest and the smallest of the numbers?

    fun largestSmallest(){
        val num1 = 15
        val num2 = 23

        println("Largest: ${maxOf(num1,num2)}")
        println("Smallest: ${minOf(num1,num2)}")
    }

    largestSmallest()

    // Given 179 minutes, Create a function that is able to to convert the said minutes into hours and to show the remainder of the minutes.

        fun convertMinutes(totalMinutes: Int) {
        val hours = totalMinutes / 60
        val minutes = totalMinutes % 60
        
        println("$totalMinutes minutes = $hours hours and $minutes minutes")
    }
    
    convertMinutes(179)  // Output: 179 minutes = 2 hours and 59 minutes

}