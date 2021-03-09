package lc_mar

class RemovePalindromicSubsequences {
    fun removePalindromeSub(s: String): Int {
        if (s.isEmpty()) return 0
        return if (s == s.reversed()) 1 else 2
    }
}