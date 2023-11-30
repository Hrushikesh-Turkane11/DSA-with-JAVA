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
    public ListNode mid(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head)
    {
        ListNode midNode=mid(head);
        ListNode prev=null;
        ListNode curr=midNode;
        ListNode next1;

        while(curr!=null)
        {
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        ListNode right=prev;
        ListNode left=head;

        while(right!=null)
        {
            if(right.val!=left.val)
            {
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
}