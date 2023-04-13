
//interface Reader {
//    fun readChar(): Char?
//    fun readString(): String {
//        TODO("Call readChar() until it returns null")
//    }
//}

fun interface Reader {
    fun readChar(): Char?
    fun readString(): String {
        val result = StringBuilder()
        do {
            val nextChar = readChar()
            if (nextChar != null) {
                result.append(nextChar)
            }
        } while (nextChar != null)
        return result.toString()
    }
}

class MyReader(val str: String) : Reader {
    var pos = 0
    override fun readChar(): Char? =
        if (pos < str.length) str[pos++] else null
}

fun main() {
    val input = MyReader("This is a String!")
    println(input.readString())
}