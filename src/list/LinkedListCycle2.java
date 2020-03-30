package list;

/**
 * leetcode 142. 环形链表 II
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        // //方法一：哈希表 时间复杂度O(n) 空间复杂度O(n)
        // Set<ListNode> visited = new HashSet<>();
        // while(head != null){
        //     if (visited.contains(head)){
        //         return head;
        //     } else {
        //         visited.add(head);
        //         head = head.next;
        //     }
        // }
        // return null;

        //方法二：Floyd（弗洛伊德）算法 时间复杂度O(n) 空间复杂度O(1)
        if (head == null) {
            return null;
        }

        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }

    private ListNode getIntersect(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }

        return null;
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
