package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class RemovePalindromicSubsequencesTest {
    private lateinit var obj: RemovePalindromicSubsequences

    @Before
    fun setup() {
        obj = RemovePalindromicSubsequences()
    }

    @Test
    fun test_removePalindromeSub() {
        Assert.assertEquals(1, obj.removePalindromeSub("ababa"))
        Assert.assertEquals(2, obj.removePalindromeSub("abb"))
        Assert.assertEquals(2, obj.removePalindromeSub("baabb"))
        Assert.assertEquals(0, obj.removePalindromeSub(""))
    }
}