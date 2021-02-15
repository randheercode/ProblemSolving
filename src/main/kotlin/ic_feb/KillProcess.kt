package ic_feb


class KillProcess {

    fun killProcess(pid: List<Int>, ppid: List<Int>, kill: Int): List<Int> {
        val p2cMap = mutableMapOf<Int, MutableList<Int>>()
        for (i in pid.indices) {
            val parent = ppid[i]
            val child = pid[i]
            p2cMap[parent] = p2cMap.getOrDefault(parent, mutableListOf()).apply {
                add(child)
            }
        }

        val result = mutableListOf<Int>()
        killFrom(listOf(kill), p2cMap, result)
        return result
    }

    private fun killFrom(kill: List<Int>, p2cMap: MutableMap<Int, MutableList<Int>>, result: MutableList<Int>) {
        result.addAll(kill)
        for (k in kill) {
            if (p2cMap.contains(k)) {
                killFrom(p2cMap[k]!!, p2cMap, result)
            }
        }
    }
}