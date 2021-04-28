package LeetCode.链表;

import java.util.Stack;

public class 反转链表 {
    /**
     * 每次取头反转
     */
//    public static ListNode reverseList(ListNode head) {
//        if(head==null){
//            return null;
//        }
//        ListNode nHead = new ListNode(head.val);
//        ListNode p = head;
//
//        while (p.next != null){
//            ListNode temp = new ListNode(p.next.val);
//            temp.next = nHead;
//            nHead = temp;
//            p = p.next;
//        }
//        return nHead;
//    }

    /**
     * 栈反转
     */
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while (p!=null){
            stack.push(p);
            p = p.next;
        }
        ListNode nHead =stack.pop();
        ListNode result= nHead;
        while (!stack.empty()){
            ListNode temp = stack.pop();
            nHead.next = temp;
            nHead = nHead.next;
        }
        nHead.next = null;
        return result;
    }

//    public static void main(String[] args) {
//        ListNode head1 = new ListNode(1,null);//创建链表的头节点
//        head1.addListNode(2);
//        head1.addListNode(41);
//        head1.addListNode(42);
//        ListNode result = reverseList(head1);
//        while(result!=null){
//            System.out.print(result.val+" ");
//            result = result.next;
//        }
//    }
}
