class Square(_name: String) : Shape(_name) {
    var length = 0.0
    var height = 0.0

    open fun setDimensions(_length: Double, _height: Double){
        length = _length
        height = _height
    }

    override fun printDimension() {
        println("Length: ${length}   Height: ${height}")
    }

    override fun getArea(): Double{
        return length * height
    }
}