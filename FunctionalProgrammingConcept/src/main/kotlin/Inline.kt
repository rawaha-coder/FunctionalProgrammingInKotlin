inline fun cube(x: Int): Int = x * x * x

inline fun doubleCube(x: Int) = cube(x) + cube(x)

fun main() {
    assertOrThrow("") {
        doubleCube(2) == 16
    }
}