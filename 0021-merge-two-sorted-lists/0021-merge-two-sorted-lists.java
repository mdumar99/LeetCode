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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode head = merged;

        while((list1!=null)&&(list2!=null)){
            if(list1.val < list2.val){
                merged.next = new ListNode(list1.val);
                list1 = list1.next;
                merged = merged.next;
            }else if(list1.val > list2.val){
                merged.next = new ListNode(list2.val);
                list2 = list2.next;
                merged = merged.next;
            }else if(list1.val == list2.val){
                merged.next = new ListNode(list1.val);
                merged = merged.next;
                merged.next = new ListNode(list2.val);
                merged = merged.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }

        if(list1==null){
            while(list2!=null){
                merged.next = new ListNode(list2.val);
                list2 = list2.next;
                merged = merged.next;
            }
        }else if(list2==null){
            while(list1!=null){
                merged.next = new ListNode(list1.val);
                list1 = list1.next;
                merged = merged.next;
            }
        }

        return head.next;
    }
}