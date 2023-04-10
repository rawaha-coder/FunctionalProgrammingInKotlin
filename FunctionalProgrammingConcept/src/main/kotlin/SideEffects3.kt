interface Logger {
    fun log(msg: String)
}
val StdLogger = object : Logger { 
    override fun log(msg: String) {
        println(msg)
    }
}
fun shiftLeftWithLogger(logger: Logger, x: Int): Int { // 3
    logger.log("Shift Left of $x") // 4
    return x shl 1
}
fun notWithLogger(logger: Logger, x: Int): Int { // 3
    logger.log("Negate $x") // 4
    return x.inv()
}

class MockLogger : Logger {
    private val internalLog = StringBuilder()
    val log: String
        get() = internalLog.toString()
    override fun log(msg: String) {
        internalLog.append(msg)
    }
}

fun main() {
    val mockLogger1 = MockLogger()
    shiftLeftWithLogger(mockLogger1, 10)
    assertOrThrow("Problem testing shiftLeft()") {
        mockLogger1.log == "Shift Left of 10"
    }
    val mockLogger2 = MockLogger()
    notWithLogger(mockLogger2, 10)
    assertOrThrow("Problem testing not()") {
        mockLogger2.log == "Negate 10"
    }
}