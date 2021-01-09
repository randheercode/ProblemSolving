package lc_jan

// https://leetcode.com/contest/biweekly-contest-43/
class Bw43 {
    fun totalMoney(n: Int): Int {
        val week = n / 7
        val days = n % 7

        val weekAmount = week * (28 + (28 + (7 * (week - 1)))) / 2
        val daysAmount = days * (week + 1 + week + days) / 2

        return weekAmount + daysAmount
    }
}