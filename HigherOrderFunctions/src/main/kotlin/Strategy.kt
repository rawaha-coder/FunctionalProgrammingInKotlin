
fun main() {
    val array1 = intArrayOf(10, 5, 2, 7, 8, 3)
    bubbleSort(array1)
    array1.printAll()

    print("\n")
    val array2 = arrayOf(10, 5, 2, 7, 8, 3)
    bubbleSort(array2) { first, second ->
        first > second
    }
    array2.printAll()
}

fun bubbleSort(values: IntArray) {
    for (i in values.size - 1 downTo 0) {
        for (j in 0 until i) {
            if (values[j] > values[j + 1]) {
                swap(values, j, j + 1)
            }
        }
    }
}

fun <T> bubbleSort(
    values: Array<T>,
    isLarger: (T, T) -> Boolean
) {
    for (i in values.size - 1 downTo 0) {
        for (j in 0 until i) {
            if (isLarger(values[j], values[j + 1])) {
                swap(values, j, j + 1)
            }
        }
    }
}
