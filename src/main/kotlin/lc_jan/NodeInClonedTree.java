package lc_jan;

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3590/
public class NodeInClonedTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned == null) return null;
        if (cloned.val == target.val) return cloned;
        TreeNode value = getTargetCopy(original, cloned.left, target);
        if (value != null) return value;
        value = getTargetCopy(original, cloned.right, target);
        return value;
    }
}
