package lc_jan

import java.util.*

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3588/
class PalindromePermutation {
    fun canPermutePalindrome(s: String): Boolean {
        val set = HashSet<Char>()
        for (c in s) {
            if (set.contains(c)) {
                set.remove(c)
            } else {
                set.add(c)
            }
        }
        return set.size <= 1
    }
}
