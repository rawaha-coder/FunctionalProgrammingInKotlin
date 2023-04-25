fun <T> FList<T>.append(newItem: T): FList<T> = match(
    whenNil = { FList.of(newItem) },
    whenCons = { head, tail ->
        FCons(head, tail.append(newItem))
    }
)

fun <T> FList<T>.addHead(newItem: T): FList<T> =
    FCons(newItem, this)

fun main() {
//    val initialList = FList.of(1, 2)
//    val addedList = initialList.append(3)
//
//    initialList.forEach {
//        print("$it ")
//    }
//
//    println()
//    addedList.forEach {
//        print("$it ")
//    }

    val initialList = FList.of(1, 2)
    val addedList = initialList.addHead(0)
    initialList.forEach {
        print("$it ")
    }
    println()
    addedList.forEach {
        print("$it ")
    }

    val appendList = addedList.append(3)

    println()
    appendList.forEach {
        print("$it ")
    }
}