package list;

/**
 * leetcode 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // //方法一：迭代 时间复杂度O(n) 空间复杂度O(1)
        // ListNode prev = null;
        // ListNode curr = head;
        // while (curr != null){
        //     ListNode nextTemp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = nextTemp;
        // }
        // return prev;

        //方法二：递归 时间复杂度O(n) 空间复杂度O(n)
        if (head == null || head.next == null)
            return head;

        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;

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
