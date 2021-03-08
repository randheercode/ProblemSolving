package otr

class AckermannFunction {

    fun ackermann2(m: Int, n: Int): Int {
        return when {
            m == 0 -> n + 1
            n == 0 -> ackermann2(m - 1, 1)
            else -> ackermann2(m - 1, ackermann2(m, n - 1))
        }
    }

}