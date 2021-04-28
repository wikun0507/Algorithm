package LeetCode.链表;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /**
     * 在链表尾部尾部插入节点
     * 参数：节点的值。
     * 一般由头节点调用
     */
    public void addListNode(int i){
        ListNode tmp = this;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = new ListNode(i,null);
    }
}
