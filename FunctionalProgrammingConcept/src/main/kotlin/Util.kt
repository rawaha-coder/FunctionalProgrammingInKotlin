/**
 * Utility function which runs the function in input a given number of times
 */
fun Int.invokeTimes(f: (Int) -> Unit) = (1..this).forEach(f)

/**
 * Utility function which throws an AssertionError with the given message
 * if the predicate evaluates to false
 */
fun assertOrThrow(message: String, fn: () -> Boolean) {
    if (!fn()) {
        throw AssertionError(message)
    }
}