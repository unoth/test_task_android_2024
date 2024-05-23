import kotlin.math.PI
import kotlin.math.pow

class Cone(private val radius: Double, private val h: Double) : FigureSolid() {
    override fun volume(): Double {
        return (1.0 / 3.0) * h * area()
    }

    override fun area(): Double {
        return PI * radius.pow(2)
    }
}