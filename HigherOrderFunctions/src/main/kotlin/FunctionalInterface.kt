
fun main() {
    print("\n")
    val array = arrayOf(10, 5, 2, 7, 8, 3)
    bubbleSortFI(array) { first, second ->
        first > second
    }
    array.printAll()
    print("\n")
    val array1 = arrayOf(10, 54, 2, 7, 8, 3)
    val largerStrategy = IsLarger<Int> { first, second -> 
        first > second
    }
    bubbleSortFI(array1, largerStrategy)
    array1.printAll()

}

fun interface IsLarger<T> {
    fun isLarger(a: T, b: T): Boolean
}

fun <T> bubbleSortFI(
    values: Array<T>,
    largerStrategy: IsLarger<T>
) {
    for (i in values.size - 1 downTo 0) {
        for (j in 0 until i) {
            if (largerStrategy.isLarger(values[j], values[j + 1])) {
                swap(values, j, j + 1)
            }
        }
    }
}