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
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        ListNode pre = head;
        ListNode nxt = head;
        if ((count) - n == 0) return head.next;
        for(int i=1; i<count-n; i++){
            pre = pre.next;
            nxt = nxt.next;
        }

        if(pre.next==null){
           return null;
        }else if(pre.next.next == null){
            pre.next = null;
        }else{
            nxt = nxt.next.next;
            pre.next = nxt;
        }

        return head;
    }
}