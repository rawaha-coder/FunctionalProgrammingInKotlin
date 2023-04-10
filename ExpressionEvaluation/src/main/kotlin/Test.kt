
var t1: ()-> Int = { println("test call"); 2 + 8}

var x = 8

var t2 = t1

fun main() {
    println(x)
    println(t2)
    println(t2())
    println(t1)
    println(t1.invoke() + 2)
    println(t1())
}
