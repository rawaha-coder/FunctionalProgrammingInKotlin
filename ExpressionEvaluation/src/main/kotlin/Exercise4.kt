
fun shortCircuitAnd(left: () -> Boolean, right: () ->
Boolean): Boolean = if (left()) {
    right()
} else {
    false
}

fun main() {
    val inputValue = 2
    shortCircuitAnd(
        left = { println("LeftEvaluated!"); inputValue > 3 },
        right = { println("RightEvaluated!"); inputValue < 10 },
    )
}