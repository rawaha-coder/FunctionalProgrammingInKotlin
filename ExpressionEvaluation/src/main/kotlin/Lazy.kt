import kotlin.reflect.KProperty

fun main(){
    testDelegate()

    val inputValue = 3
    val greater100 by lazy { greaterThan100(inputValue) }
    if (inputValue > 4 && greater100) {
        println("OK")
    } else {
        println("KO")
    }

    multiLazy()

}

fun multiLazy() {
    val multiLambda by lazy { println("I'm MultiLambda")
        greaterThan100(3)}
    multiLambda
    multiLambda
    multiLambda
    multiLambda

    println(multiLambda)

}

fun greaterThan100(x: Int): Boolean {
    println("greaterThan100")
    return x > 100
}

fun testDelegate() {
    var variable by object {
        var localInt: Int? = null
        operator fun getValue(
            thisRef: Any?,
            property: KProperty<*>
        ): Int? {
            println("Getter Invoked returning $localInt")
            return localInt
        }
        operator fun setValue(
            thisRef: Any?,
            property: KProperty<*>,
            value: Int?
        ) {
            println("Setter Invoked with value $value")
            localInt = value
        }
    }
    variable = 10
    println("Reading $variable")
}