
fun main() {
    val input = arrayOf(1, 2, 3, 4, 5)
    println(input.first {
        it > 3
    })
    println(input.firstOrNull {
        it > 10
    })
}

inline fun <T> Array<T>.first(predicate: (T) -> Boolean): T {

    for (item in this){
        if (predicate(item)) return item
    }
    throw NoSuchElementException("Array contains no element matching the predicate.")
}

inline fun <T> Array<T>.firstOrNull(
    predicate: (T) -> Boolean
): T? {
    for (item in this) {
        if (predicate(item)) {
            return item
        }
    }
    return null
}