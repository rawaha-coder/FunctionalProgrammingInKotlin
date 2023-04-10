fun main() {
    val result = triple(average(2, 4))
    println(result)

    val inputValue = 30
    if (inputValue > 4 && greaterThan10(inputValue)) {
        println("OK")
    } else {
        println("KO")
    }

    testDelegate()
}