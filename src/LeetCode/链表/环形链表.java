package LeetCode.链表;

public class 环形链表 {
    public static boolean hasCycle(ListNode head) {
        if(head == null||head.next == null)
            return false;
        ListNode slow = head;
        ListNode first = head.next;
        int count = 0;
        while (first.next!=null){
            if(count<=-1)
                return true;
            if(first.next.val == slow.next.val){
                slow = slow.next;
                first = first.next;
                count--;
            }else {
                first = first.next;
                count++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,null);//创建链表的头节点
        head1.addListNode(2);
        head1.addListNode(3);
        head1.addListNode(4);
        head1.addListNode(5);
        head1.addListNode(6);
        head1.addListNode(7);
        head1.addListNode(8);
        head1.addListNode(9);
        head1.addListNode(10);
        ListNode point = head1.next.next.next.next.next.next.next.next.next;
        point.next = point;
        System.out.println(hasCycle(head1));

    }
}
