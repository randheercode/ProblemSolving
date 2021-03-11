package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class IntegerToRomanTest {
    private lateinit var obj: IntegerToRoman

    @Before
    fun setup() {
        obj = IntegerToRoman()
    }

    @Test
    fun test_intToRoman() {
        Assert.assertEquals("III", obj.intToRoman(3))
        Assert.assertEquals("IV", obj.intToRoman(4))
        Assert.assertEquals("IX", obj.intToRoman(9))
        Assert.assertEquals("LVIII", obj.intToRoman(58))
        Assert.assertEquals("MCMXCIV", obj.intToRoman(1994))
    }
}