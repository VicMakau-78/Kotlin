class Circle {
    // properties
    var radius = 7
    var pie = 3.142


    // Behaviours
    fun circleArea(){
        val areaOfCircle = pie * radius * radius
        println("The area of circe is: " + areaOfCircle )
    }

    fun circleCircumfrence(){
        val circumfrence = pie * radius
        println("The circumfrence of the circle is: " + circumfrence )
    }
}

// Create a class for rectangle and find the area as well as the perimeter

class Rectangle {

    // properties
    var length = 25
    var width = 20

    // Behaviours
    fun rectanglePerimeter(){
        val rectPerimeter = 2 * length + 2 * width
        println("The Perimeter of rectangle is: " + rectPerimeter)
    }

    fun rectangleArea(){
        val rectArea = length * width
        println("The area of rectangle is: " + rectArea)
    }
    
}



fun main(){
    // Below is our object
    var myCircle = Circle()

    myCircle.circleArea()
    myCircle.circleCircumfrence()

    var myRectangle = Rectangle()

    myRectangle.rectanglePerimeter()
    myRectangle.rectangleArea()
}