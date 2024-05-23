import kotlin.math.PI
import kotlin.math.pow

class Sphere(private val radius: Double) : FigureSolid() {
    override fun volume(): Double {
        return (4.0 / 3.0) * PI * radius.pow(3)
    }

    override fun area(): Double {
        return 4.0 * PI * radius.pow(2)
    }
}