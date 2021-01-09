package lc_jan


class RootOfNaryTree {
    class Node(var `val`: Int) {
        var children: List<Node?> = listOf()
    }

    fun findRoot(tree: List<Node>): Node? {
        var sum = 0
        for (node in tree) {
            sum += node.`val`
            for (child in node.children) {
                sum -= (child?.`val` ?: 0)
            }
        }
        for (node in tree) {
            if (node.`val` == sum) return node
        }
        return null
    }
}