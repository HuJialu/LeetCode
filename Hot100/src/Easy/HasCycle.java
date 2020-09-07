package Easy;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jialu Hu
 * @create 2020-09-07 19:04
 * 环形链表
 */
public class HasCycle {
    public boolean hasCycleWithHashSet(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleWithTwoPointer(ListNode head){
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
}
