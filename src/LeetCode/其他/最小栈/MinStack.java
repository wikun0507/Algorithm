package LeetCode.其他.最小栈;

public class MinStack {
    ListNode head;
    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int val) {
        if (empty()){
            head = new ListNode(val,val,null);
        }else{
            head = new ListNode(val,Math.min(val,head.min),head);
        }
    }

    public void pop() {
        this.head = this.head.next;
    }

    public int top() {
        return this.head.val;
    }

    private boolean empty() {
        return head == null;
    }
    public int getMin(){
        return head.min;
    }

    static class ListNode {
        int val;
        int min;
        ListNode next;
        ListNode() {}
        ListNode(int val, int min,ListNode next) { this.val = val; this.min = min; this.next = next; }
    }
}
