open class Triangle(_name: String) : Shape(_name) {
    var a = 0.0
    var b = 0.0
    var c = 0.0

    open fun setDimensions(_a: Double, _b: Double, _c: Double){
        a = _a
        b = _b
        c = _c
    }

    override fun printDimension() {
        println("Side A: $a   Side B: $b   Side C: $c")
    }

    override fun getArea(): Double{
        var s = (a + b + c)/2.0
        return Math.sqrt(s * (s-a) * (s-b) * (s-c))
    }
}