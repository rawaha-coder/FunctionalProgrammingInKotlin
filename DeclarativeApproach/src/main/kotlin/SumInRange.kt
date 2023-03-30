fun sumInRange(input: List<String>, range: IntRange): Int = input
    .filter(::isValidNumber )
    .map(String::toInt)
    .filter {it in range}
    .sum()