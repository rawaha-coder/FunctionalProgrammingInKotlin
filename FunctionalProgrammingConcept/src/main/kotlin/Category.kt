
inline infix fun <B,C,A> Fun<B,C>.after(crossinline f: Fun<A,B>): Fun<A,C> =
    {a->
        this(f(a))
    }
val comp2AfterComp1 = ::comp2 after ::comp1