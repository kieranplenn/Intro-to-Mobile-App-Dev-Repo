class Circle(_name: String) : Shape(_name) {
    var radius = 0.0

    open fun setDimensions(_radius: Double){
        radius = _radius
    }
    override fun printDimension() {
        println("Radius: ${radius}")
    }

    override fun getArea(): Double{
        return Math.PI * radius * radius
    }
}