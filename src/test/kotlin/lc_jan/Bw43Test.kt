package lc_jan

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class Bw43Test {
    private lateinit var obj: Bw43

    @Before
    fun setup() {
        obj = Bw43()
    }

    @Test
    fun totalMoney() {
        Assert.assertEquals(10, obj.totalMoney(4))
        Assert.assertEquals(37, obj.totalMoney(10))
        Assert.assertEquals(96, obj.totalMoney(20))
    }
}