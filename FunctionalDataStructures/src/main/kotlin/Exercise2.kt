fun <T> FList<T>.tail(): FList<T> = match(
    whenNil = { FList.empty()},
    whenCons = {_, tail -> tail}
)