package lc_jan


class KthMissingPositiveNumber {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var totalMissing = 0
        if (arr[0] != 1) {
            totalMissing = if (arr.size > 1) arr[0] - 1 else {
                return if (arr[0] <= k) k + 1 else k
            }
        }
        if (totalMissing >= k) return k
        for (i in 1 until arr.size) {
            val currentMissing = arr[i] - arr[i - 1] - 1
            if (totalMissing + currentMissing >= k)
                return arr[i - 1] + (k - totalMissing)
            totalMissing += currentMissing
        }
        return arr[arr.size - 1] + (k - totalMissing)
    }
}