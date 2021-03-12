package lc_mar


class CoinChange {
    fun coinChange(coins: IntArray, amount: Int): Int {
        return if (amount < 1) 0 else coinChange(coins, amount, IntArray(amount))
    }

    private fun coinChange(coins: IntArray, rem: Int, count: IntArray): Int {
        if (rem < 0) return -1
        if (rem == 0) return 0
        if (count[rem - 1] != 0) return count[rem - 1]
        var min = Int.MAX_VALUE
        for (coin in coins) {
            val res = coinChange(coins, rem - coin, count)
            if (res in 0 until min) min = 1 + res
        }
        count[rem - 1] = if (min == Int.MAX_VALUE) -1 else min
        return count[rem - 1]
    }
}