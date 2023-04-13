fun main() {
    println(declarative(emails))
  println(moreDeclarative(emails))
}

fun declarative(emails: List<String>): List<String> =
    emails
        .filter { EMAIL_REG_EX.matches(it) }
        .filter { it.length > 10 }
        .take(5)

fun moreDeclarative(emails: List<String>): List<String> =
    emails
        .filter(::isEmailValid)
        .filter(::isEmailLongEnough)
        .take(5)

fun isEmailValid(email: String) =
    EMAIL_REG_EX.matches(email)

fun isEmailLongEnough(email: String) =
    email.length > 10
