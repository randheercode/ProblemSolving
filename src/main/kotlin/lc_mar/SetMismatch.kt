package lc_mar

import kotlin.math.abs

class SetMismatch {
    fun findErrorNums(nums: IntArray): IntArray {
        var dup = -1
        var missing = 1
        for (n in nums) {
            if (nums[abs(n) - 1] < 0) dup = abs(n)
            else nums[abs(n) - 1] *= -1
        }
        for (i in 1 until nums.size) {
            if (nums[i] > 0) missing = i + 1
        }
        return intArrayOf(dup, missing)
    }
}