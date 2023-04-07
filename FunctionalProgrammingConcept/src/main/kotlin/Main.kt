fun main(args: Array<String>) {
    println("**************************************")
    println("*** Functional Programming Concept ***")
    println("**************************************")

    var f: Fun<Int, Int> = ::twice
    println("Executing twice(10)")
    f(10)
    f = ::twiceAndLog
    println("Executing twiceAndLog(10)")
    f(10)

    println("**************************************")

    println(inc(1))
    println(inc(1))
    println(inc(1))
    println(inc(1))

    println("**************************************")

    println(randomInc(10))
    println(randomInc(10))
    println(randomInc(10))
    println(randomInc(10))

    println("**************************************")

    println(inc2(1))
    println(inc2(1))
    println(inc2(1))
    println(inc2(1))

    println("**************************************")
}