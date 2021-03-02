package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DistributeCandiesTest {

    private lateinit var obj: DistributeCandies

    @Before
    fun setup() {
        obj = DistributeCandies()
    }

    @Test
    fun test_distributeCandies() {
        Assert.assertEquals(3, obj.distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)))
        Assert.assertEquals(2, obj.distributeCandies(intArrayOf(1, 1, 2, 3)))
        Assert.assertEquals(1, obj.distributeCandies(intArrayOf(6, 6, 6, 6)))
    }
}