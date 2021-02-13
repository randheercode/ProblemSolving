package ic_feb


class NumberOfStep {
    fun numberOfSteps(num: Int): Int {
        var num = num
        var res = 0
        while (num > 0) {
            when {
                num.rem(2) == 0 -> num /= 2
                else -> num -= 1
            }
            res++
        }
        return res
    }

    fun numberOfStepsOptimal(num: Int): Int {
        val binaryString = num.toString(2)
        var steps = 0
        for (bit in binaryString) {
            steps = if (bit == '1') {
                steps + 2
            } else {
                steps + 1
            }
        }
        return steps - 1
    }

}