package LeetCode.剑.旋转链表;

import LeetCode.链表.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author WiKunZ
 * @Date 2021/5/28-22:44
 */
public class Solution {
//    public static ListNode rotateRight(ListNode head, int k) {
//        if(head==null)
//            return null;
//        ListNode result = head;
//        List<ListNode> list = new ArrayList<>();
//        while(head!=null){
//            list.add(head);
//            head = head.next;
//        }
//        if(list.size()==1)
//            return result;
//        int realMove = k % list.size();
//        if(realMove==0)
//            return result;
//        int newHeadIndex = list.size()-realMove;
//        result = list.get(newHeadIndex);
//        list.get(newHeadIndex-1).next=null;
//        ListNode tmp = result;
//        while(tmp.next!=null){
//            tmp = tmp.next;
//        }
//        tmp.next = list.get(0);
//        return result;
//    }

    /**
     * 成环做法
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode markS = head;
        int length = 1;
        while(head.next!=null){
            length++;
            head = head.next;
        }
        //连成环
        head.next = markS;
        int realMove = k%length;
        if(realMove==0){
            head.next = null;
            return markS;
        }else{
            int step = length-1-realMove;
            for(int i = 0;i<step;i++){
                markS = markS.next;
            }
            ListNode result = markS.next;
            markS.next = null;
            return result;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,null);//创建链表的头节点
        head1.addListNode(2);
        head1.addListNode(3);
        head1.addListNode(4);
        head1.addListNode(5);
        ListNode.showList(rotateRight(head1,1));
//        System.out.println(0%2);
    }
}
