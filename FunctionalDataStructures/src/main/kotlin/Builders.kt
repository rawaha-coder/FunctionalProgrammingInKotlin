//fun <T> fListOf(vararg items: T): FList<T> {
//    val tail = items.sliceArray(1 until items.size)
//    return if (items.isEmpty()) Nil else FCons(items[0],
//        fListOf(*tail))
//}
//
//fun main() {
//
//    val flist = fListOf(1, 2, 3)
//
//    println(flist)
//
//   // val emptyList = fListOf<Int>()
//
//    val emptyList = Nil
//    val singleElementFList = FCons(2, fListOf())
//
//}