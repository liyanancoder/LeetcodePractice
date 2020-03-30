package list;

/**
 * leetcode 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // //方法一：哈希表 时间复杂度O(n) 空间复杂度O(n)
        // Set<ListNode> nodesSeen = new HashSet<>();
        // while (head != null){
        //     if (nodesSeen.contains(head)){
        //         return true;
        //     } else {
        //         nodesSeen.add(head);
        //     }
        //     head = head.next;
        // }
        // return false;

        //方法二：双指针 快慢指针 时间复杂度O(n) 空间复杂度O(1)
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
