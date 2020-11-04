package Easy;

import util.ListNode;

/**
 * 反转链表
 * @author Jialu Hu
 * @create 2020-11-04 20:46
 */
public class ReverseList {
    //迭代
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    //递归
    /*
    不妨假设链表为1，2，3，4，5。
    按照递归，当执行reverseList（5）的时候返回了5这个节点，reverseList(4)中的p就是5这个节点，
    我们看看reverseList（4）接下来执行完之后，5->next = 4, 4->next = null。这时候返回了p这个节点，也就是链表5->4->null.
    接下来执行reverseList（3），代码解析为4->next = 3,3->next = null，这个时候p就变成了，5->4->3->null,
    reverseList(2), reverseList(1)依次类推，p就是:5->4->3->2->1->null
     */
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
