fun Int.times(function: (Int) -> Unit) {
    (1..this).forEach(function)
}