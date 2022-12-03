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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode st = head;
        ListNode en = head;
        int[] arr = new int[k];

        while(true){
            arr[0] = en.val;
            for(int i=1; i<k; i++){
                en = en.next;
                if(en==null) return head;
                arr[i] = en.val;
            }

            int ep = k - 1;
            while(ep>=0){
                st.val = arr[ep];
                ep--;
                st = st.next;
            }
            
            if(st==null) break;
            en = en.next;

            

        }

        return head;
    }
}