package lc_jan

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3592/
class MergeTwoSortedLists {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val res = ListNode(0)
        var curr: ListNode? = res
        var first = l1
        var second = l2
        while (first != null && second != null) {
            if (first.`val` < second.`val`) {
                curr?.next = first
                first = first.next
                curr = curr?.next
            } else {
                curr?.next = second
                second = second.next
                curr = curr?.next
            }
        }
        while (first != null) {
            curr?.next = first
            first = first.next
            curr = curr?.next
        }

        while (second != null) {
            curr?.next = second
            second = second.next
            curr = curr?.next
        }

        return res.next
    }
}