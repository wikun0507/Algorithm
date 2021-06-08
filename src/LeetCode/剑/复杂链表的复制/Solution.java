package LeetCode.剑.复杂链表的复制;

import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/6/6-10:45
 */
public class Solution {
    //    public static Node copyRandomList(Node head) {
//        if(head==null)
//            return null;
//        Map<Node,Node> map = new LinkedHashMap<>();
//        Node cur = head;
//        while(cur!=null){
//            map.put(cur,new Node(cur.val));
//            cur = cur.next;
//        }
//        cur = head;
//        while(cur!=null){
//            map.get(cur).next = map.get(cur.next);
//            map.get(cur).random = map.get(cur.random);
//            cur = cur.next;
//        }
//        return map.get(head);
//    }
    public static Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random =map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);
        head.next = node1;
        head.random = null;
        node1.next = node2;
        node1.random = head;
        node2.next = node3;
        node2.random = node4;
        node3.next = node4;
        node3.random = node2;
        node4.next = null;
        node4.random = head;
        Node result = copyRandomList(head);
        System.out.println(result.val);
    }

}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
