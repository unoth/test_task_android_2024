fun main() {
    val values = findDuplicate(intArrayOf(4, 5, 2, 2, 5, 7, 2, 3, 5, 6, 2, 7, 3))
    for ((num, count) in values) {
        println("$num: $count")
    }
}

fun findDuplicate(array: IntArray): MutableMap<Int, Int> {
    val newArray = mutableMapOf<Int, Int>()
    for (num in array) {
        newArray[num] = (newArray.getOrDefault(num, 0) + 1)
    }
    return newArray
}

