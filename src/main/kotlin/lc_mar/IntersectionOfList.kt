package lc_mar

class IntersectionOfList {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var pA = headA
        var pB = headB
        while (pA !== pB) {
            pA = if (pA == null) headB else pA.next
            pB = if (pB == null) headA else pB.next
        }
        return pA
    }
}