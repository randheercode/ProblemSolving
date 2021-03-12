package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CoinChangeTest {
    private lateinit var obj: CoinChange

    @Before
    fun setup() {
        obj = CoinChange()
    }

    @Test
    fun test_coinChange() {
        Assert.assertEquals(3, obj.coinChange(intArrayOf(1, 2, 5), 11))
        Assert.assertEquals(-1, obj.coinChange(intArrayOf(2), 3))
        Assert.assertEquals(0, obj.coinChange(intArrayOf(1), 0))
        Assert.assertEquals(2, obj.coinChange(intArrayOf(1), 2))
        Assert.assertEquals(20, obj.coinChange(intArrayOf(186, 419, 83, 408), 6249))
    }
}