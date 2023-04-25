fun <T> FList<T>.size(): Int = match(
    whenNil = { 0 },
    whenCons = { head, tail -> 1 + tail.size() }
)

fun <T> FList<T>.head(): T? = match(
    whenNil = { null },
    whenCons = { head, _ -> head }
)


//fun <T> FList<T>.size(): Int = when (this) {
//    is Nil -> 0
//    is FCons<T> -> 1 + tail.size()
//}