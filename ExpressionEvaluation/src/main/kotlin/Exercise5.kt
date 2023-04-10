import kotlin.reflect.KProperty

fun main(){

 val fn:()-> Int = {12}
  val test = myLazy(fn)

println(test)
 println(test.invoke())



}

fun <A : Any> myLazy(fn: () -> A): () -> A {
 var result: A? = null
 return {
  if (result == null) {
   result = fn()
  }
  result!! 
 }
}





