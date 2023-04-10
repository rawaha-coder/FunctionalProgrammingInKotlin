
fun <A> myNullableLazy(fn: () -> A?): () -> A? {
    var evaluated = false // HERE
    var result: A? = null
    return { ->
        if (!evaluated) {
            evaluated = true
            result = fn()
        }
        result
    }
}

fun main() {
    val myNullableLazy: () -> Int? =
        myNullableLazy { println("I'm nullable lazy!"); null }
    3.times {
        println(myNullableLazy())
    }

    val testNullableLazy: () -> Int? =
        myNullableLazy { println("I'm nullable lazy!"); 7+8 }
    3.times {
        println(testNullableLazy())
    }
}