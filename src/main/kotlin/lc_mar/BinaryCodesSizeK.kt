package lc_mar


class BinaryCodesSizeK {
    fun hasAllCodes(s: String, k: Int): Boolean {
        var need = 1 shl k
        val got = BooleanArray(need)
        val allOne = need - 1
        var hashVal = 0
        for (i in s.indices) {
            hashVal = hashVal shl 1 and allOne or (s[i] - '0')
            if (i >= k - 1 && !got[hashVal]) {
                got[hashVal] = true
                need--
                if (need == 0) {
                    return true
                }
            }
        }
        return false
    }
}