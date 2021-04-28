package LeetCode.链表;

public class 删除链表的倒数第N个节点 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = head;
        ListNode p = head;
        int index = 0;
        while(p!=null){
            p = p.next;
            index++;
        }
        if(n>index){
            return null;
        }
        for(int i = 0;i<index-n-1;i++){
            head = head.next;
        }
        if(n == 1 && index != 1){
            head.next = null;
        }else if(n==index){
            head = head.next;
            result = head;
        } else {
            head.next = head.next.next;
        }
        return result;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,null);//创建链表的头节点
        head1.addListNode(2);
        head1.addListNode(41);
        head1.addListNode(42);
        ListNode result = removeNthFromEnd(head1,1);
        while(result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}
