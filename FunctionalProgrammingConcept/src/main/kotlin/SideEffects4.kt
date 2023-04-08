
fun shiftLeftWithEffect(x: Int): Pair<Int, String> {
    return x shl 1 to "Shift Left of $x"
}
fun notWithEffect(x: Int): Pair<Int, String> {
    return x.inv() to "Negate $x"
}

infix fun <A, B, C> Writer<B, C>.after(
    w: Writer<A, B>
): Writer<A, C> = { a: A ->
    val (b, str) = w(a)
    val (c, str2) = this(b)
    c to "$str\n$str2\n"
}

fun main() {
    val f: Writer<Int, Int> = ::shiftLeftWithEffect
    val g: Writer<Int, Int> = ::notWithEffect
    val shiftLeftAndNotWithEffects = g after f
    println(shiftLeftAndNotWithEffects(10).second)
}