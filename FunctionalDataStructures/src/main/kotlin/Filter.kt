typealias Predicate<T> = (T) -> Boolean

fun <T> FList<T>.filter(predicate: Predicate<T>): FList<T> = match(
    whenNil = { FList.empty() },
    whenCons = { head, tail ->
        if (predicate(head)) {
            FCons(head, tail.filter(predicate))
        } else {
            tail.filter(predicate)
        }
    }
)

fun main() {
    FList.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .filter { it % 3 == 0 }
        .forEach { println(it) }

    listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .take(3)
        .forEach { print("$it ") }

}