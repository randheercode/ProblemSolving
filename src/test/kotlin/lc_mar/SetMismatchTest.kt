package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SetMismatchTest {
    private lateinit var obj: SetMismatch

    @Before
    fun setup() {
        obj = SetMismatch()
    }

    @Test
    fun test_distributeCandies() {
        Assert.assertArrayEquals(intArrayOf(2, 3), obj.findErrorNums(intArrayOf(1, 2, 2, 4)))
        Assert.assertArrayEquals(intArrayOf(1, 2), obj.findErrorNums(intArrayOf(1, 1)))
        Assert.assertArrayEquals(intArrayOf(2, 1), obj.findErrorNums(intArrayOf(2, 2)))
    }
}