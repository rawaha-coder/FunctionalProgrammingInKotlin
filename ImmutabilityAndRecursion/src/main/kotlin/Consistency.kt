data class MutableKey(
    var id: Int
)
fun main() {
    val key1 = MutableKey(1)
    val key2 = MutableKey(2)
    val myMap = mutableMapOf(
        key1 to "First",
        key2 to "Second"
    )
    println("Value for $key1 is ${myMap[key1]}")
    key1.id = 2
    println("Value for $key1 is ${myMap[key1]} after key1 update")
    println("Value for $key2 is ${myMap[key2]}")
    println("The Map is $myMap")
    myMap.remove(key1).also { println("Removed $key1 from myMap") }
    myMap.remove(key2).also { println("Removed $key2 from myMap") }
    println("The Map after remove is $myMap")
    println("Value for $key1 is ${myMap[key1]} after key1 remove")
    println("Value for $key2 is ${myMap[key2]} after key2 remove")

    val key3 = Key(1)
    val key4 = Key(2)
    val myMap1 = mutableMapOf(
        key3 to "First",
        key4 to "Second"
    )

    //key3.id = 2

}

data class Key(
    val id: Int // HERE
)