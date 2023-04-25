fun <T> FList<T>.take(n: Int): FList<T> = match(
    whenNil = { FList.empty() },
    whenCons = { head, tail ->
        if (n > 0) {
            FCons(head, tail.take(n - 1))
        } else {
            FList.empty()
        }
    }
)

fun <T> FList<T>.takeLast(n: Int): FList<T> = match(
    whenNil = { FList.empty() },
    whenCons = { head, tail ->
        if (tail.size() >= n) {
            tail.takeLast(n)
        } else {
            FCons(head, tail)
        }
    }
)

fun <T> FList<T>.skip(n: Int): FList<T> = match(
    whenNil = { FList.empty() },
    whenCons = { head, tail ->
        if (n > 0) {
            tail.skip(n - 1)
        } else {
            FCons(head, tail)
        }
    }
)

fun <T> FList<T>.takeLast2(n: Int): FList<T> =
    skip(size() - n)

fun main(){
    FList.of(1, 2, 3, 4, 5)
        .take(0)
        .forEach { print("$it ") }
    println()
    FList.of(1, 2, 3, 4, 5)
        .take(2)
        .forEach { print("$it ") }
    println()
    FList.of(1, 2, 3, 4, 5)
        .take(6)
        .forEach { print("$it ") }

    (0..6).forEach {
        println("takeLast $it")
        FList.of(1, 2, 3, 4, 5)
            .takeLast(it)
            .forEach { print("$it ") }
        println()
    }
}