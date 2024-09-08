class EquilateralTriangle(_name: String) : Triangle(_name) {
    var length = 0.0

    open fun setDimensions(_length: Double){
        length = _length
    }

    override fun printDimension() {
        println("Length: ${length}")
    }

    override fun getArea(): Double{
        return Math.sqrt(3.0) * length * length / 4
    }


}