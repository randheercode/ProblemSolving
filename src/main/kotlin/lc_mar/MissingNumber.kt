package lc_mar

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        val expectedSum: Int = nums.size * (nums.size + 1) / 2
        var actualSum = 0
        for (num in nums) actualSum += num
        return expectedSum - actualSum
    }
}