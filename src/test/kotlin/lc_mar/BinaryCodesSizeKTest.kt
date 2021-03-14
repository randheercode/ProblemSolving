package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BinaryCodesSizeKTest {
    private lateinit var obj: BinaryCodesSizeK

    @Before
    fun setup() {
        obj = BinaryCodesSizeK()
    }

    @Test
    fun test_hasAllCodes() {
        Assert.assertTrue(obj.hasAllCodes("00110110", 2))
        Assert.assertTrue(obj.hasAllCodes("00110", 2))
        Assert.assertTrue(obj.hasAllCodes("0110", 1))
        Assert.assertFalse(obj.hasAllCodes("0110", 2))
        Assert.assertFalse(obj.hasAllCodes("0000000001011100", 4))
    }
}