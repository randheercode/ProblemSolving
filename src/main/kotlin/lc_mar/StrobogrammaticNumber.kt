package lc_mar

class StrobogrammaticNumber {
    fun isStrobogrammatic(num: String): Boolean {
        var s = 0
        var e = num.lastIndex
        while (s <= e) {
            val st = num[s]
            val en = num[e]
            when (st) {
                '0' -> {
                    if (en != '0') return false
                }
                '1' -> {
                    if (en != '1') return false
                }
                '6' -> {
                    if (en != '9') return false
                }
                '9' -> {
                    if (en != '6') return false
                }
                '8' -> {
                    if (en != '8') return false
                }
                else -> return false
            }
            s++
            e--
        }
        return true
    }
}