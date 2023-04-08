fun shiftLeft(x: Int) = x shl 1
fun not(x: Int) = x.inv()

val shiftLeftAndNot = ::not after ::shiftLeft

fun main() {
    val comp1 = not(shiftLeft(10))
    val comp2 = shiftLeftAndNot(10)
    assertOrThrow("comp1 != comp2") {
        comp1 == comp2
    }

    println(shiftLeft(10))
    println(not(10))
}