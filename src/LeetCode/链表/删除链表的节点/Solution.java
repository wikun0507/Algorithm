package LeetCode.链表.删除链表的节点;

import LeetCode.链表.ListNode;

/**
 * @Author WiKunZ
 * @Date 2021/5/14-19:45
 */
public class Solution {
    public static ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            return head.next;
        }
        ListNode result = head;
        ListNode prev = null;
        while(head.val!=val){
            prev = head;
            head = head.next;   //找到与val相同的节点
        }
        prev.next = head.next;
        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        for(int i = 2;i<=5;i++){
            head.addListNode(i);
        }
        ListNode tmp = deleteNode(head,4);
        while (tmp!=null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
    }
}
