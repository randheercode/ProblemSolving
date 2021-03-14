package lc_mar

import java.util.*


class BinaryTreesWithFactors {
    fun numFactoredBinaryTrees(A: IntArray): Int {
        val MOD = 1000000007
        val N = A.size
        Arrays.sort(A)
        val dp = LongArray(N)
        Arrays.fill(dp, 1)
        val index: MutableMap<Int, Int> = mutableMapOf()
        for (i in 0 until N) index[A[i]] = i
        for (i in 0 until N) for (j in 0 until i) {
            if (A[i] % A[j] == 0) {
                val right = A[i] / A[j]
                if (index.containsKey(right)) {
                    dp[i] = (dp[i] + dp[j] * dp[index[right]!!]) % MOD
                }
            }
        }
        var ans: Long = 0
        for (x in dp) ans += x
        return (ans % MOD).toInt()
    }
}