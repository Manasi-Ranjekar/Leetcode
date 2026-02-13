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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode curr=head;
        ListNode nx=head.next;
        while(nx!=null){
            if(curr.val!=nx.val){
                curr=curr.next;
                curr.val=nx.val;
            }
            nx=nx.next;
        }
        curr.next=null;
        return head;
    }
}