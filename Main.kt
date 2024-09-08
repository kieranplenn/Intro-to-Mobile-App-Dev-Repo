import  java.util.Scanner

fun main(args: Array<String>) {
    val square = Square("Square")
    val circle = Circle("Circle")
    val triangle = Triangle("Triangle")
    val equi_triangle = EquilateralTriangle("Equilateral Triangle")

    val scnr = Scanner(System.`in`)

    print("Enter the dimensions of a square\nLength: ")
    var square_length : Double = scnr.nextDouble()
    print("Height: ")
    var square_height : Double = scnr.nextDouble()

    print("Enter the dimensions of a circle\nRadius: ")
    var radius : Double = scnr.nextDouble()

    print("Enter the dimensions of a triangle\nSide A: ")
    var side_A : Double = scnr.nextDouble()
    print("Side B: ")
    var side_B : Double = scnr.nextDouble()
    print("Side C: ")
    var side_C : Double = scnr.nextDouble()

    print("Enter the dimensions of an equilateral triangle\nSide length: ")
    var equi_length : Double = scnr.nextDouble()

    square.setDimensions(square_length, square_height)
    circle.setDimensions(radius)
    triangle.setDimensions(side_A, side_B, side_C)
    equi_triangle.setDimensions(equi_length)

    println(square.name)
    square.printDimension()
    println("Area: ${square.getArea()}")

    println(circle.name)
    circle.printDimension()
    println("Area: ${circle.getArea()}")

    println(triangle.name)
    triangle.printDimension()
    println("Area: ${triangle.getArea()}")

    println(equi_triangle.name)
    equi_triangle.printDimension()
    println("Area: ${equi_triangle.getArea()}")
}