package LeetCode.链表;

public class 合并两个有序链表 {
//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        //1 2 41 1 4 5
//        //    q    p
//        ListNode p = l2;
//        ListNode q = l1;
//        ListNode result = p;
//        ListNode tmp1 = q;
//
//        while(q!=null){
//            if(q.next==null)
//            {
//                while(p.next.val<q.val){
//                    p = p.next;
//                    if(p.next==null)
//                        break;
//                }
//                p.next = q;
//                return result;
//            }
//            if(q.next.val<=p.next.val){
//                q = q.next;
//            }else {
//                ListNode tmp2 = p.next;
//                ListNode tmp3 = q.next;
//                p.next = tmp1;
//                q.next = tmp2;
//                p = q.next;
//                tmp1 = tmp3;
//                q = tmp3;
//            }
//        }
//
//        return result;
//    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode result = new ListNode();
        ListNode p = result;
        while(l1!=null&&l2!=null){
            if(l1.val> l2.val){
                result.next = l2;
                l2 = l2.next;
            }else {
                result.next = l1;
                l1 = l1.next;
            }
            result = result.next;
        }
        result.next = l1==null?l2:l1;
        return p.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,null);//创建链表的头节点
        head1.addListNode(2);
        head1.addListNode(41);
        head1.addListNode(42);
//        ListNode nL = head1;
//        while(nL != null){
//            System.out.print(nL.val);
//            nL = nL.next;
//        }
//        System.out.println();
        ListNode head2 = new ListNode(1,null);//创建链表的头节点
        head2.addListNode(4);
        head2.addListNode(5);
        head1.addListNode(42);
//        nL = head2;
//        while(nL !=null ){
//            System.out.print(nL.val);
//            nL = nL.next;
//        }
        ListNode tmp = mergeTwoLists(head1,head2);
        while(tmp!=null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
    }
}
