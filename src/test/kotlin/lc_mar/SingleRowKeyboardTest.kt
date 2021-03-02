package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SingleRowKeyboardTest {

    private lateinit var obj: SingleRowKeyboard

    @Before
    fun setup() {
        obj = SingleRowKeyboard()
    }

    @Test
    fun test_calculateTime() {
        Assert.assertEquals(4, obj.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"))
        Assert.assertEquals(73, obj.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"))
    }
}