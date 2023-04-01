fun main() {
    println("*** Functional Programming In Kotlin ***")

    val input = listOf(
        "123", "abc", "1ds", "987", "abdf", "1d3", "de1", "88", "101"
    )

    println("imperative Sum: ${imperativeSum(input)}")

    println("declarative Sum : ${declarativeSum(input)}")

    println("sum In Range: ${sumInRange(input, 3..200)}")

    3.times {
        println("Hello")
    }

    val waitOneSec = { Thread.sleep(1000) }
    println(chronometer(waitOneSec))

    val result = double(square(10))
    println(result)

    println(squareAndDouble(10))

    val squareDouble = ::square compose ::double

    println(squareDouble(10))

    println(impure(2))
    println(impure(2))

    addOneAndLog(2)
    addOneAndLog(2)

    val p = addOneAndLogPure(5)

    println(p.second)

}
