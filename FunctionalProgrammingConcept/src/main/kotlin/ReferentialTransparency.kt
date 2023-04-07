fun main() {
    val expr1 = { 3 * 10 }
    val (a1, a2) = expr1() to expr1()
    val expr1Eval = expr1()
    val (a1Eval, a2Eval) = expr1Eval to expr1Eval
    assertOrThrow("expr1 is not RT") {
        a1 == a1Eval && a2 == a2Eval
    }

    var count = 1 // 1
    val expr2 = { 3 * 10 * ++count } // 2
    val (b1, b2) = expr2() to expr2()
    val expr2Eval = expr2()
    val (b1Eval, b2Eval) = expr2Eval to expr2Eval
    assertOrThrow("expr2 is not RT") {
        b1 == b1Eval && b2 == b2Eval
    }
}