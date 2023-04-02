
fun double(x: Int): Int = 2 * x
fun square(x: Int): Int = x * x

fun squareAndDouble(x: Int) = double(square(x))

infix fun <A, B, C> ((A) -> B).compose(
        g: (B) -> C
    ): (A) -> C = { a ->
    g(this(a))
}