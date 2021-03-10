package lc_mar

class AddOneRowToTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun addOneRow(root: TreeNode?, v: Int, d: Int): TreeNode? {
        if (d == 1) {
            val newRoot = TreeNode(v)
            newRoot.left = root
            return newRoot
        }
        addRowAt(root?.left, root, v, d, true, 2)
        addRowAt(root?.right, root, v, d, false, 2)
        return root
    }

    private fun addRowAt(node: TreeNode?, parent: TreeNode?, v: Int, d: Int, isLeft: Boolean, currentDepth: Int) {
        if (d == currentDepth) {
            val newNode = TreeNode(v)
            if (isLeft) {
                parent?.left = newNode
                newNode.left = node
            } else {
                parent?.right = newNode
                newNode.right = node
            }
            return
        }
        addNode(node, currentDepth, d, v)
    }

    private fun addNode(node: TreeNode?, currentDepth: Int, d: Int, v: Int) {
        if (node?.left == null && currentDepth == d - 1) {
            val newNode = TreeNode(v)
            node?.left = newNode
        } else {
            node?.left?.let { addRowAt(it, node, v, d, true, currentDepth + 1) }
        }
        if (node?.right == null && currentDepth == d - 1) {
            val newNode = TreeNode(v)
            node?.right = newNode
        } else {
            node?.right?.let { addRowAt(it, node, v, d, false, currentDepth + 1) }
        }
    }
}