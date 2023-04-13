fun main() {
    println(imperative(emails))
}

fun imperative(emails: List<String>): List<String> =
    mutableListOf<String>()
        .apply {
            for (i in 0 until emails.size) {
                val email = emails[i]
                if (EMAIL_REG_EX.matches(email) && email.length > 10) {
                    add(email)
                    if (size >= 5) {
                        break
                    }
                }
            }
        }

val emails = listOf(
    "emauuigzuz",
    "te@il.co",
    "aaaaa@eemail.com",
    "wwwww@eemail.com",
    "invalidemail",
    "fffff@esmail.com",
    "hhhhh@exmail.com",
    "ikjuh@evmail.com",
    "tzdztdztd@ghchg",
    "kkkkk@enmail.com",
    "email1@elmail.com",
    "ggjc@gtf.hgz.",
    "kijuz@elmail.com",
    "zgtf@egmail.com",
    "email1@ermail.com",
)

val EMAIL_REG_EX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})".toRegex()