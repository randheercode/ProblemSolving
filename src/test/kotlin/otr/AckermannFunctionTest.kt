package otr

import org.junit.Before
import org.junit.Test
import kotlin.system.measureTimeMillis

class AckermannFunctionTest {
    private lateinit var obj: AckermannFunction

    @Before
    fun setup() {
        obj = AckermannFunction()
    }

    @Test
    fun test_ackermann2() {
        val target = 0..3
        for (m in target) {
            for (n in target) {
                check(m, n)
            }
        }
    }

    private fun check(m: Int, n: Int) {
        val time = measureTimeMillis {
            obj.ackermann2(m, n)
        }
        println("Time Taken in ackermann2 for m=$m, n=$n is ${time}ms")
    }
}