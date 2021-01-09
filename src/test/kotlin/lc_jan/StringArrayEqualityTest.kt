package lc_jan

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class StringArrayEqualityTest {
    private lateinit var obj: StringArrayEquality

    @Before
    fun setup() {
        obj = StringArrayEquality()
    }

    @Test
    fun canPermutePalindrome() {
        Assert.assertTrue(obj.arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")))
        Assert.assertFalse(obj.arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("ab", "c")))
        Assert.assertTrue(obj.arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")))
    }
}