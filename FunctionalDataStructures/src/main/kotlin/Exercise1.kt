fun <T> FList<T>.isEmpty(): Boolean = match(
    whenNil = {true},
    whenCons = {_,_ -> false}
)

// fun <T> FList<T>.isEmpty(): Boolean = size() == 0

