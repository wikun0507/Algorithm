package LeetCode.剑.合并两个排序的链表;

import LeetCode.链表.ListNode;

/**
 * @Author WiKunZ
 * @Date 2021/5/22-19:55
 */
public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode f = new ListNode();
        ListNode result = new ListNode(0,null);
        f = result;
        while(l1!=null&&l2!=null){
            if(l1.val <= l2.val){
                result.next = l1;
                l1 = l1.next;
            }else{
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        result.next = l1==null?l2:l1;
        return f.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,null);//创建链表的头节点
        head1.addListNode(2);
        head1.addListNode(4);
//        head1.addListNode(42);
        ListNode head2 = new ListNode(1,null);//创建链表的头节点
        head2.addListNode(3);
        head2.addListNode(4);
//        head2.addListNode(42);
        ListNode tmp = mergeTwoLists(head1,head2);
        while(tmp!=null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
    }
}
