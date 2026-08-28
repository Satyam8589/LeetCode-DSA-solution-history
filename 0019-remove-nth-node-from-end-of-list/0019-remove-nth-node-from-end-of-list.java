/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int count = 0;
        ListNode start = head;

        while (start != null) {
            start = start.next;
            count++;
        }

        int remNodeCnt = count - n;

        ListNode temp = dummy;

        for (int i = 0; i < remNodeCnt; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return dummy.next;
    }
}