package ic_feb

import java.util.*


class ScoreOfParentheses {

    fun scoreOfParentheses(S: String): Int {
        return calc(S, 0, S.lastIndex)
    }

    private fun calc(S: String, s: Int, e: Int): Int {
        var res = 0
        val indices = balInx(S, s, e)
        for (idx in indices) {
            res += if (idx[0] + 1 == idx[1]) {
                1
            } else {
                (2 * calc(S, idx[0] + 1, idx[1] - 1))
            }
        }
        return res
    }

    private fun balInx(S: String, s: Int, e: Int): List<IntArray> {
        val res = mutableListOf<IntArray>()
        val stack = Stack<Char>()
        for (i in s..e) {
            if (stack.isEmpty()) {
                res.add(IntArray(2) { i })
                stack.push(S[i])
                continue
            }
            val last = stack.peek()
            if (last == '(' && S[i] == ')') {
                stack.pop()
            } else {
                stack.push(S[i])
            }
            if (stack.isEmpty()) {
                res.last()[1] = i
            }
        }
        return res
    }
}