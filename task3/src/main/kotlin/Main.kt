fun main() {
    val figuresList: List<FigureSolid> = listOf(
        Cube(3.0),
        Sphere(2.5),
        Cylinder(3.0, 5.5),
        Cone(3.5, 2.0)
    )

    for (figure in figuresList) {
        println("${figure::class.java.simpleName} volume: ${figure.volume()}  area: ${figure.area()}")

    }
}