
val empty = {}

var operation: (Int, Int) -> Int = { a, b -> a + b }

val lambda = { a: Int, b: Int -> a + b }

val testLambda = { a: Int ->
    val doubleA = a * 2
    if (doubleA > 10) "$doubleA is Greater than 10"
    else "$doubleA is Smaller or Equal to 10"
}

fun main() {
    val result = operation(3, 4)
    println(result)
    val result1 = operation.invoke(3, 4)
    println(result1)
    val result2 = testLambda.invoke(3)
    println(result2)
    val result3 = testLambda.invoke(6)
    println(result3)

}