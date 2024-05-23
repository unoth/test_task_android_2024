fun main() {
    val values = intArrayOf(4, 32, 6, 87, 4, 12, 5)
    println(findDuplicate(values))
}

fun findDuplicate(array: IntArray): Set<Int> {
    val newArray = array.toList().filter { number -> array.count { it == number } > 1 }.toSet()
    return newArray
}