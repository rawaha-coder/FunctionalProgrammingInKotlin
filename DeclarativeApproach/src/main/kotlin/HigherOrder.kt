

fun Int.times(fn: () -> Unit) = (1..this).forEach{ _ -> fn()}

fun chronometer(fn: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    fn()
    return System.currentTimeMillis() - startTime
}