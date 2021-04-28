package LeetCode.链表;

public class 回文链表 {
    public static boolean isPalindrome(ListNode head) {
        if(head==null)
            return false;
        if(head.next==null)
            return true;
        反转链表 reverse = new 反转链表();
        ListNode first = head;
        ListNode slow = head;
        while(first!=null && first.next!=null){
            first = first.next.next;
            slow = slow.next;
        }
        if(first!=null){
            slow = slow.next;
        }
        slow = reverse.reverseList(slow);
        first = head;
        while(slow!=null){
            if(first.val != slow.val)
                return false;
            slow = slow.next;
            first = first.next;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,null);//创建链表的头节点
        head1.addListNode(0);
        head1.addListNode(0);
//        head1.addListNode(1);
        System.out.println(isPalindrome(head1));
    }
}
