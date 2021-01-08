package lc_jan

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LongestSubstringWoRepeatingCharactersTest {
    private lateinit var obj: LongestSubstringWoRepeatingCharacters

    @Before
    fun setup() {
        obj = LongestSubstringWoRepeatingCharacters()
    }

    @Test
    fun canPermutePalindrome() {
        Assert.assertEquals(3, obj.lengthOfLongestSubstring("abcabcbb"))
        Assert.assertEquals(1, obj.lengthOfLongestSubstring("bbbbb"))
        Assert.assertEquals(3, obj.lengthOfLongestSubstring("pwwkew"))
        Assert.assertEquals(0, obj.lengthOfLongestSubstring(""))
        Assert.assertEquals(2, obj.lengthOfLongestSubstring("abba"))
    }
}