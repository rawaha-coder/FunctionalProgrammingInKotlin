import org.junit.Assert.*
import org.junit.Test

class PureKtTest{
    @Test
    fun test100Times() {
        var c = 0
        100.invokeTimes {
            val (count, _) = countedAbs(c, it)
            c = count
        }
        assertEquals(100, c)
    }

    @Test
    fun test50Times() {
        var c = 0
        50.invokeTimes {
            val (count, _) = countedAbs(c, it)
            c = count
        }
        assertEquals(50, c)
    }
}