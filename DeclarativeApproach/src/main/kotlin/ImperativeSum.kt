fun imperativeSum(list: List<String>): Int {
    var sum = 0
    for (item in list) {
        try {
            sum += item.toInt()
        } catch (nfe: NumberFormatException) {
        }
    }
    return sum
}