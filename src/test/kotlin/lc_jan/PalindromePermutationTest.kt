package lc_jan

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PalindromePermutationTest {
    private lateinit var obj: PalindromePermutation

    @Before
    fun setup() {
        obj = PalindromePermutation()
    }

    @Test
    fun canPermutePalindrome() {
        Assert.assertFalse(obj.canPermutePalindrome("code"))
        Assert.assertTrue(obj.canPermutePalindrome("aab"))
        Assert.assertTrue(obj.canPermutePalindrome("carerac"))
    }
}
