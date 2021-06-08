package LeetCode.链表.相交链表;

import LeetCode.链表.ListNode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @Author WiKunZ
 * @Date 2021/6/4-10:17
 */
public class Solution {
    /**
     * 栈解法
     */
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA==headB)
//            return headA;
//        Stack<ListNode> s1 = new Stack<>();
//        Stack<ListNode> s2 = new Stack<>();
//        ListNode A = headA;
//        ListNode B = headB;
//        while(A!=null){
//            s1.add(A);
//            A = A.next;
//        }
//        while(B!=null){
//            s2.add(B);
//            B = B.next;
//        }
//        ListNode tmp1 = null;
//        ListNode tmp2 = null;
//        while(!s1.empty()||!s2.empty()){
//            if(s1.empty()) tmp1 = null;
//            else tmp1 = s1.pop();
//            if(s2.empty()) tmp2 = null;
//            else tmp2 = s2.pop();
//            if (tmp1!=tmp2)
//                break;
//        }
//        ListNode result = tmp1==null?tmp2:tmp1;
//        return result.next;
//    }

    /**
     * 哈希Set解法
     * 慢
     */
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null)
//            return null;
//        Set<ListNode> set = new HashSet<>();
//        ListNode pA = headA;
//        ListNode pB = headB;
//        while (pA != null) {
//            set.add(pA);
//            pA = pA.next;
//        }
//        while (pB != null) {
//            if (set.contains(pB)) {
//                return pB;
//            } else {
//                pB = pB.next;
//            }
//        }
//        return null;
//    }

    /**
     * 长的先走两者的差值
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode pA = headA,pB = headB;
        int lengthA = 0,lengthB = 0;
        while(pA!=null){
            lengthA++;
            pA = pA.next;
        }
        while(pB!=null){
            lengthB++;
            pB = pB.next;
        }
        pA = headA;
        pB = headB;
        for (int i = 0; i < Math.abs(lengthA-lengthB); i++) {
            if((lengthA-lengthB)>0)
                pA = pA.next;
            else
                pB = pB.next;
        }
        while(pA!=pB){
            pA = pA.next;
            pB = pB.next;
        }
        return pA;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,null);
        l1.addListNode(2);
        ListNode l2 = new ListNode(2,null);
        l2.addListNode(2);
        ListNode node = new ListNode(4,null);
        node.addListNode(5);
        node.addListNode(4);
        l1.next.next = node;
        l2.next.next = node;
        ListNode l3 = new ListNode(3,null);
        ListNode l4 = null;
//        l4.next = l3;
        System.out.println(getIntersectionNode(l1,l2).val);
        System.out.println(getIntersectionNode(l3,l4).val);
    }

}
