import java.util.*

data class User(
    val id: Int,
    val username: String
)

data class WrongImmutableUser(
    val id: Int,
    val username: String,
    val dob: java.util.Date = Date()
)

data class UserDefensiveCopy(
    val id: Int,
    val username: String,
    val _dob: java.util.Date = Date() // 1
) {
    val dob: Date // 2
        get() = Date().apply { // 3
            time = _dob.time
        }
}

fun main() {
    val w = WrongImmutableUser(1, "max")
    println(w)
    w.dob.time = 1000L
    println(w)

    println("\n**************************\n")

    val d = UserDefensiveCopy(1, "max")
    println(d)
    d.dob.time = 1000L
    println(d)

    println("\n**************************\n")

    val mutableUser = MutableUser(8, "maxcarli")
    println(mutableUser)
    mutableUser.username = "massimo"
    println(mutableUser)
}

data class MutableUser(
    val id: Int,
    var username: String
)