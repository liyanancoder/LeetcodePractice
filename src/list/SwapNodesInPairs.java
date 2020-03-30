package list;

/**
 * leetcode 24. 两两交换链表中的节点
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        // //方法一：递归 时间复杂度O(n) 空间复杂度O(n),因为递归过程使用的堆栈空间
        // if(head == null || head.next == null){
        //     return head;
        // }

        // ListNode firstNode = head;
        // ListNode secondNode = head.next;

        // firstNode.next = swapPairs(secondNode.next);
        // secondNode.next = firstNode;

        // return secondNode;

        //方法二：迭代 时间复杂度O(n) 空间复杂度O(1)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevNode = dummy;

        while ((head != null) && (head.next != null)) {
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            prevNode = firstNode;
            head = firstNode.next;
        }
        return dummy.next;
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
