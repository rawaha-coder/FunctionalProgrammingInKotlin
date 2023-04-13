
val isValidEmail: Predicate1<String> =
    Predicate1 { value -> EMAIL_REG_EX.matches(value) }

fun isLongerThan(length: Int): Predicate1<String> =
    Predicate1 { value -> value.length > length }

fun main() {
    emails
        .filterWithPredicate(isValidEmail and isLongerThan(10))
        .take(5)
        .forEach(::println)


    println(isValidEmail.accept("ztf"))
}