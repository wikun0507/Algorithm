package LeetCode.链表.移除链表元素;

import LeetCode.链表.ListNode;

/**
 * @Author WiKunZ
 * @Date 2021/6/5-11:03
 */
public class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        ListNode fast = head;
        ListNode slow  = new ListNode(0,head);
        ListNode result = slow;
        while(fast!=null){
            if(fast.val==val){
                slow.next = fast.next;
            }else{
                slow = fast;
            }
            fast = fast.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,null);
        for(int i = 2;i<=6;i++){
            head.addListNode(i);
        }
        head.next.next = new ListNode(6,head.next.next);
        ListNode.showList(head);
        ListNode.showList(removeElements(head,1));
        ListNode head2 = new ListNode(7,null);
        for(int i = 0;i<3;i++){
            head2.addListNode(7);
        }
        ListNode.showList(removeElements(head2,7));
    }

}
