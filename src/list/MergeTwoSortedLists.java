package list;

/**
 * leetcode 21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // //1、递归
        // if (l1 == null){
        //     return l2;
        // }else if (l2 == null){
        //     return l1;
        // }else if (l1.val < l2.val){
        //     l1.next = mergeTwoLists(l1.next,l2);
        //     return l1;
        // }else {
        //     l2.next = mergeTwoLists(l1,l2.next);
        //     return l2;
        // }

        //2、迭代
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
