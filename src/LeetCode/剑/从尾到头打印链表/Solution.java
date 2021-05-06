package LeetCode.剑.从尾到头打印链表;

import LeetCode.剑.ListNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author WiKunZ
 * @Date 2021/5/4-15:28
 */
public class Solution {
    public static int[] res;
    public static int i = 0;
    public static int j = 0;
    public static int[] reversePrint(ListNode head) {
//        if (head==null)
//            return new int[]{};
//        Stack<Integer> stack = new Stack<>();
//        while(head!=null){
//            stack.push(head.val);
//            head = head.next;
//        }
//        int[] result = new int[stack.size()];
//        int i = 0;
//        while (!stack.empty()){
//            result[i++] = stack.pop();
//        }
//        return result;
        /**
         * 递归版本
         */
        if (head==null)
            return res;
        DFS(head);
        return res;
    }
    public static void DFS(ListNode head){
        if(head==null){
            res = new int[i];
            return;
        }
        i++;
        DFS(head.next);
        res[j] = head.val;
        j++;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0,null);
        for (int i = 1;i<9;i++){
            head.addListNode(i);
        }
        System.out.println(Arrays.toString(reversePrint(head)));
    }
}
