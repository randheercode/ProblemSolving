package lc_jan

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3589/
class ArrayFormationConcatenation {
    fun canFormArray(arr: IntArray, pieces: Array<IntArray>): Boolean {
        val map = pieces.map { it[0] to it }.toMap()

        var idx = 0

        while (idx < arr.size) {
            if (!map.containsKey(arr[idx])) return false

            val elem = map[arr[idx]]!!
            var i = 0
            while (i < elem.size && idx < arr.size) {
                if (elem[i] != arr[idx]) break
                i++
                idx++
            }

        }

        return true
    }
}