package lc_mar

import kotlin.math.abs

class SingleRowKeyboard {

    fun calculateTime(keyboard: String, word: String): Int {
        val idx = keyboard.mapIndexed { i, c -> c to i }.toMap()
        var time = 0
        var current = 0
        for (c in word) {
            val next = idx[c]!!
            time += abs(current - next)
            current = next
        }
        return time
    }

}