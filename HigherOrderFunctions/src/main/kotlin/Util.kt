
fun swap(values: IntArray, i: Int, j: Int) {
    if (values[i] != values[j]) {
        val tmp = values[i]
        values[i] = values[j]
        values[j] = tmp
    }
}

fun <T> swap(values: Array<T>, i: Int, j: Int) {
    if (values[i] != values[j]) {
        val tmp = values[i]
        values[i] = values[j]
        values[j] = tmp
    }
}

fun IntArray.printAll() {
    this.forEach {
        print(" $it")
    }
}

fun <T> Array<out T>.printAll() {
    this.forEach {
        print(" $it")
    }
}