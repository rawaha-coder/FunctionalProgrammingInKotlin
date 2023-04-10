fun main() {
    val inputValue = 3
    val greater10 = {greaterThan10(inputValue)}
    if (inputValue > 4 && greater10()) {
        println("OK")
    } else {
        println("KO")
    }
}