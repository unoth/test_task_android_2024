import kotlin.math.PI
import kotlin.math.pow

class Cylinder(private val radius: Double, private val h: Double) : FigureSolid() {
    override fun volume(): Double {
        return PI * radius.pow(2) * h
    }

    override fun area(): Double {
        return PI * radius.pow(2)
    }
}