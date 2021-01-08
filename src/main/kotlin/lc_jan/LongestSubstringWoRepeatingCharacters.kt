package lc_jan

import java.util.HashSet


class LongestSubstringWoRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        val n: Int = s.length
        val set: MutableSet<Char> = HashSet()
        var ans = 0
        var i = 0
        var j = 0
        while (i < n && j < n) {
            if (!set.contains(s[j])) {
                set.add(s[j++])
                ans = maxOf(ans, j - i)
            } else {
                set.remove(s[i++])
            }
        }
        return ans
    }
}