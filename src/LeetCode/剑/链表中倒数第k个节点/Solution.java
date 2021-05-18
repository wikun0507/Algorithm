package LeetCode.剑.链表中倒数第k个节点;

import LeetCode.链表.ListNode;

/**
 * @Author WiKunZ
 * @Date 2021/5/18-22:44
 */
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head;
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        if(count==0)
            return null;
        k = count-k;
        while (k!=0){
            slow = slow.next;
            k--;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        for(int i = 2;i<=5;i++){
            listNode.addListNode(i);
        }
        ListNode result = new Solution().getKthFromEnd(listNode,2);
        while(result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}
