
fun strToInt(str: String): Int = str.toInt()

fun strToIntOrNull(str: String): Int? =
     try {
        str.toInt()
    }catch (e: NumberFormatException){
        null
    }

fun strToIntResult(str: String): Result<Int> =
    try {
        Result.success(str.toInt())
    } catch (nfe: NumberFormatException) {
        Result.failure(nfe)
    }
