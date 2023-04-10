
/** Typealias representing the type of all the functions from A to B */
typealias Fun<A, B> = (A) -> B

typealias Writer<A, B> = (A) -> Pair<B, String>