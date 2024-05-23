import kotlin.math.pow

class Cube(private val side: Double) : FigureSolid() {
    override fun volume(): Double {
        return side.pow(3)
    }

    override fun area(): Double {
        return 6.0 * side.pow(2)
    }
}