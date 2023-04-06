fun main() {
    println("*****************************")
    println("*** Function Fundamentals ***")
    println("*****************************")


    fun twice(a: Int): Int = a * 2
    fun format(b: Int): String = "Result is $b"

    fun formatAfterTwice(x: Int) = format(twice(x))

    println(format(twice(37)))
    println(formatAfterTwice(37))

    val f: Fun<Int, Int> = ::twice
    val g: Fun<Int, String> = ::format
    val formatTwice1 = g after f
    println(formatTwice1(37))

    val formatTwice2 = g compose f
    println(formatTwice2(37))

    val formatTwice3 = g test f
    println(formatTwice3(37))

    fun length(s: String): Int = s.length

    val h: Fun<String, Int> = ::length
    val leftSide = (h after g) after f
    val rightSide = h after (g after f)
    println(leftSide(37) == rightSide(37))

    fun <A> absurd(a: Nothing): A = a as A

    fun <A> unit(a: A): Unit = Unit

    fun <A> unit2(a: A): Unit {
        println("I'm different")
        return Unit
    }

    fun one(u: Unit): Int = 1
    fun two(u: Unit): Int = 2
    fun minusThree(u: Unit): Int = -3

    val twiceTwo = ::twice after ::two
    println(twiceTwo(Unit))

    println(" 0  is even?  ${evenIntSet(0)}")
    println(" 9  is even?  ${evenIntSet(-9)}")
    println(" 10 is even?  ${evenIntSet(10)}")
    println(" 3  is even?  ${evenIntSet(3)}")
    (0..10)
        .filter(evenIntSet)
        .forEach { println(it) }

    val oddMultipleOf37Union =
        union(oddIntSet, multipleOf37)
    val oddMultipleOf37Intersection =
        intersection(oddIntSet, multipleOf37)

    println("1   is in union ${oddMultipleOf37Union(1)}")
    println("37  is in union ${oddMultipleOf37Union(37)}")
    println("74  is in union ${oddMultipleOf37Union(74)}")
    println("100 is in union ${oddMultipleOf37Union(100)}")

    println("1   is in intersection ${oddMultipleOf37Intersection(1)}")
    println("37  is in intersection ${oddMultipleOf37Intersection(37)}")
    println("74  is in intersection ${oddMultipleOf37Intersection(74)}")
    println("100 is in intersection ${oddMultipleOf37Intersection(100)}")
}

val evenIntSet: Predicate<Int> = { a: Int -> a % 2 == 0 }

/** The set of all the odd Ints */
val oddIntSet: Predicate<Int> = { a: Int -> a % 2 != 0 }

/** The set of all the multiple of 37 ints*/
val multipleOf37: Predicate<Int> = { a: Int -> a % 37 == 0 }

/** The union of the two sets */
fun <A> union(set1: Predicate<A>, set2: Predicate<A>): Predicate<A> = { a: A ->
    set1(a) || set2(a)
}

/** The intersection of the two sets */
fun <A> intersection(set1: Predicate<A>, set2: Predicate<A>): Predicate<A> = { a: A ->
    set1(a) && set2(a)
}