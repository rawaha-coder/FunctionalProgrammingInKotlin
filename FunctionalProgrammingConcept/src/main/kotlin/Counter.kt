
fun main(){
    val expr4 = { CounterIterator.next() }
    val (c1, c2) = expr4() to expr4()
    val expr4Eval = expr4()
    val (d1Eval, d2Eval) = expr4Eval to expr4Eval

    assertOrThrow("expr4 is not RT") {
        c1 == d1Eval && c2 == d2Eval
    }
}

val CounterIterator = object : Iterator<Int> {
    private var count = 0
    override fun hasNext(): Boolean = true
    override fun next(): Int = count++
}
