
fun declarativeSum(list: List<String>): Int = list
    .filter(::isValidNumber)
    .map(String::toInt)
    .sum()


fun isValidNumber(str: String): Boolean =
    try {
        str.toInt()
        true
    } catch (nfe: NumberFormatException) {
        false
    }