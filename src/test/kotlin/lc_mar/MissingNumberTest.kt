package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MissingNumberTest {
    private lateinit var obj: MissingNumber

    @Before
    fun setup() {
        obj = MissingNumber()
    }

    @Test
    fun test_distributeCandies() {
        Assert.assertEquals(2, obj.missingNumber(intArrayOf(3, 0, 1)))
        Assert.assertEquals(2, obj.missingNumber(intArrayOf(0, 1)))
        Assert.assertEquals(8, obj.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
        Assert.assertEquals(1, obj.missingNumber(intArrayOf(0)))
        Assert.assertEquals(0, obj.missingNumber(intArrayOf(1)))
    }
}