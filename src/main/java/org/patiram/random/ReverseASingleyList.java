package org.patiram.random;

public class ReverseASingleyList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode temp = head;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null) {
            ListNode t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
        while(prev != null){
            System.out.println(prev.val);
            prev = prev.next;
        }
    }
}
