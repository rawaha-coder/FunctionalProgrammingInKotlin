fun interface CharReader {
    fun readChar(): Char?
}

fun interface StringReader {
    fun readString(charReader: CharReader): String
}

val stringReader = StringReader { charReader ->
    val result = StringBuilder()
    do {
        val nextChar = charReader.readChar()
        if (nextChar != null) {
            result.append(nextChar)
        }
    } while (nextChar != null)
    result.toString()
}

fun String.toCharReader(): CharReader {
    var pos = 0
    return CharReader {
        if (pos < this.length) this[pos++] else null
    }
}

fun main() {
    println(stringReader.readString("This is String!".toCharReader()))
}