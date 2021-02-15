package ic_feb

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class KillProcessTest {

    private lateinit var obj: KillProcess

    @Before
    fun setup() {
        obj = KillProcess()
    }

    @Test
    fun numberOfSteps() {
        Assert.assertEquals(listOf(5, 10), obj.killProcess(listOf(1, 3, 10, 5), listOf(3, 0, 5, 3), 5))
    }
}