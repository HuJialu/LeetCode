package util;

/**
 * @author Jialu Hu
 * @create 2020-09-05 15:55
 * Definition for singly-linked list
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
