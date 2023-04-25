data class Node<T>(
    val value: T,
    val next: Node<T>? = null
)
fun main() {
    val emptyList: Node<*>? = null
    val singleValueList = Node(1, null)
    val twoValuesList = Node(2, Node(1, null))
}