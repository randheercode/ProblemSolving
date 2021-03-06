package lc_mar

class LevelAverageBST {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val next = mutableListOf<TreeNode>()
        val current = mutableListOf<TreeNode>()
        val levels = mutableListOf<MutableList<TreeNode>>()

        root?.let { current.add(it) }
        while (current.isNotEmpty()) {
            next.clear()
            val newL = mutableListOf<TreeNode>()
            newL.addAll(current)
            levels.add(newL)
            for (c in current) {
                c.left?.let { next.add(it) }
                c.right?.let { next.add(it) }
            }
            current.clear()
            current.addAll(next)
        }

        return levels.map { it -> it.sumByDouble { it.`val`.toDouble() }.div(it.size) }.toDoubleArray()

    }
}