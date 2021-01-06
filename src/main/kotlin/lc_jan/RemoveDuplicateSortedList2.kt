package lc_jan

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3593/
class RemoveDuplicateSortedList2 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var head = head
        val sentinel = ListNode(0)
        sentinel.next = head

        var pred: ListNode? = sentinel
        while (head != null) {
            if (head.next != null && head.`val` == head.next!!.`val`) {
                while (head!!.next != null && head.`val` == head.next!!.`val`) {
                    head = head.next
                }
                pred!!.next = head.next
            } else {
                pred = pred!!.next
            }
            head = head.next
        }
        return sentinel.next
    }
}