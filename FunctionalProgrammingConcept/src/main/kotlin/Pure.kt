import kotlin.random.Random

fun twice(x: Int): Int = x * 2
fun twiceAndLog(x: Int): Int {
    val result = x * 2
    println("2 * $x = $result")
    return result
}

fun randomInc(a: Int): Int = a + Random.nextInt()

fun abs(x: Int) = if (x < 0) -x else x

var countAbs = 0
fun countedAbs(x: Int): Int {
    countAbs++
    return abs(x)
}

fun countedAbs(count: Int, a: Int): Pair<Int, Int> =
    abs(a) to count + 1


var sharedCount = 1
fun comp1(x: Int): String = "Hello ${x + sharedCount}"
fun comp2(x: String): Int = x.length - sharedCount