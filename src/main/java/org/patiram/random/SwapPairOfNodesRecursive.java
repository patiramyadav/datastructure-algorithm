package org.patiram.random;

//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
public class SwapPairOfNodesRecursive {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        swapPairs(head);
    }
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null) return head;
        int temp= head.val;
        head.val = head.next.val;
        head.next.val = temp;
        swapPairs(head.next.next);
        return head;
    }

}
