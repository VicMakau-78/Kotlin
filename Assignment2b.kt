fun main(){
    val points = 500

if (points < 100 && points > 0){
    println("you do not qualify")
}
else if (points > 100 && points < 400){
    println("you win a smartphone")
}
else if(points >= 400 && points <= 1000){
    println("you win a laptop")
}

else if(points > 1000){
    println("You win a trip to canada")
}

else{
    println("Invalid points entered")
}
}