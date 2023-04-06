
inline infix fun <A, B, C> Fun<B, C>.after(crossinline f: Fun<A,
        B>): Fun<A, C> =
    { a: A ->
        this(f(a))
    }

inline infix fun <A, B, C> Fun<B, C>.compose(crossinline f:Fun<A,
        B>): Fun<A,C> = {
            a:A -> this(f(a))
}

fun <A> identity(value: A) = value

inline infix fun <A,B,C> Foo<B,C>.test(crossinline f:Foo<A,
        B>): Foo<A,C> = {
            a:A -> this(f(a))
}
