fun main() {
    val emptyList = FList.empty<Int>()
    val singleElementList = FList.of(1)
    val singleElementList2 = FCons(1, emptyList)
    val twoElementsList = FList.of(1, 2)

    println(FList.empty<Int>().size())
    println(FList.of(1).size())
    println(FList.of(1, 2, 3).size())

    println(FList.empty<Int>().isEmpty())
    println(FList.of(1).isEmpty())
    println(FList.of(1, 2, 3).isEmpty())

    println(FList.empty<Int>().head())
    println(FList.of(1).head())
    println(FList.of(1, 2, 3).head())

    println(FList.empty<Int>().tail())
    println(FList.of(1).tail())
    println(FList.of(1, 2, 3).tail())
}