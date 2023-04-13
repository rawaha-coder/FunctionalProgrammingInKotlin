

fun <T> T.isEqualsPredicate(): (T) -> Boolean {
    return {
        it == this
    }
}

fun main() {
    listOf(1, 2, 3, 4, 4, 5, 6, 7, 8, 8)
        .filter(4.isEqualsPredicate())
        .forEach(::println)

    val o = 7.isEqualsPredicate().invoke(4)
    println(o)
    val t = "e".isEqualsIPredicate().accept("e")

    println(t)
}

fun interface SinglePredicated<T> {
    fun accept(other: T): Boolean
}

fun <T> T.isEqualsIPredicate(): SinglePredicated<T> =
    SinglePredicated<T> { value -> this == value }

