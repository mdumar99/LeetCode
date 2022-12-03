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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode cur = head;
        ListNode nxt = cur.next;

        while(nxt!=null){
            int temp;
            temp = nxt.val;
            nxt.val = cur.val;
            cur.val = temp;

            if(nxt.next!=null){
                nxt = nxt.next.next;
                cur = cur.next.next;
            }else{
                nxt = nxt.next;
            }
        }

        return head;
    }
}