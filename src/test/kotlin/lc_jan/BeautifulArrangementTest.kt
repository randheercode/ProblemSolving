package lc_jan

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class BeautifulArrangementTest {
    private lateinit var obj: BeautifulArrangement

    @Before
    fun setup() {
        obj = BeautifulArrangement()
    }

    @Test
    fun canPermutePalindrome() {
        Assert.assertEquals(1, obj.countArrangement(1))
        Assert.assertEquals(3, obj.countArrangement(2))
    }
}