package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StrobogrammaticNumberTest {
    private lateinit var obj: StrobogrammaticNumber

    @Before
    fun setup() {
        obj = StrobogrammaticNumber()
    }

    @Test
    fun test_isStrobogrammatic() {
        Assert.assertEquals(true, obj.isStrobogrammatic("69"))
        Assert.assertEquals(true, obj.isStrobogrammatic("88"))
        Assert.assertEquals(false, obj.isStrobogrammatic("962"))
        Assert.assertEquals(true, obj.isStrobogrammatic("1"))
        Assert.assertEquals(false, obj.isStrobogrammatic("6"))
    }
}