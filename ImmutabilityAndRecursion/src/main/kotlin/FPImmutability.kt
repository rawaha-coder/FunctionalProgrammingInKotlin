

fun main() {
    val multipleOf5 = { value: Int -> value % 5 == 0 }
    val total = listOf(1, 5, 10, 12, 34, 55, 80, 23, 35, 12, 80)
        .filter(multipleOf5)
        .sum()
    println("Total: $total")
}

//fun main() {
//    var total = 0
//    val list = listOf(1, 5, 10, 12, 34, 55, 80, 23, 35, 12, 80)
//    for (i in 0 until  list.size) {
//        if (list[i] % 5 == 0) {
//            total += list[i]
//        }
//    }
//    println("Total: $total")
//
//}