package Easy;

import util.ListNode;

/**
 * 相交链表
 * @author Jialu Hu
 * @create 2020-11-01 20:31
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode pa = headA;
        ListNode pb = headB;

        while(pa != pb){
            if(pa == null)
                pa = headB;
            else
                pa = pa.next;

            if(pb == null)
                pb = headA;
            else
                pb = pb.next;
        }
        return pa;
    }
}
