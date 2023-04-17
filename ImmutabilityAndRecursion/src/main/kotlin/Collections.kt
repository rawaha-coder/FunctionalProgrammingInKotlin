fun main() {
    val immutableList = listOf(1, 2, 3, 4, 5) // 1
    val asMutableList = immutableList as MutableList<Int> // 2
    //asMutableList.add(10) // 3
  //immutableList.add(10) // DOESN'T COMPILE

    println(immutableList)

    immutableList[0] = 2

    println(immutableList)

    val m = mutableListOf(3,4,7)

    println(m)

    m.add(2,8)

    println(m)

}