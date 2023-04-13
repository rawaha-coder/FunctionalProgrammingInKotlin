
fun main() {
    10.timesD {
        print(" $it")
    }
    print("\n")
    10.timesI{
        print(" $it")
    }
}

fun Int.timesD(fn: (Int) -> Unit) = (1..this).forEach(fn)

fun Int.timesI(fn: (Int) -> Unit) {
    var i = 1
    while (i <= this) {
        fn(i++)
    }
}