
fun main() {
    val constantUser = MutableUser(1, "Max") // 1
    //constantUser = MutableUser(2, "Alice") // 2 ERROR
    constantUser.username = "Alice"// 3


}

fun changeUsername(user: MutableUser) { // 1
    //user = MutableUser(2, "Alice") // ERROR // 2
    user.username = "Alice" // 3
}

