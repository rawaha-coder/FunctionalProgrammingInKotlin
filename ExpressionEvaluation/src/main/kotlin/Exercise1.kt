import kotlin.math.pow
import kotlin.math.sqrt

val distance = { x1:Double, x2: Double, y1: Double, y2:Double ->
    sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))
}

fun main() {
    println(distance(3.0, 2.0, 5.0, 4.0))
}