package lc_jan


class BeautifulArrangement {
    var count = 0

    fun countArrangement(n: Int): Int {
        val nums = IntArray(n)
        for (i in 0 until n) nums[i] = i + 1
        permute(nums, 0)
        return count
    }

    private fun permute(nums: IntArray, k: Int) {
        if (k == nums.size) count++
        for (i in k until nums.size) {
            swap(nums, i, k)
            if (nums[k] % (k + 1) == 0 || (k + 1) % nums[k] == 0) permute(nums, k + 1)
            swap(nums, i, k)
        }
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}