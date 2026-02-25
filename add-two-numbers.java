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

    public int carry(int x, int y) {
        if (x + y >= 10) {
            return 1;
        }
        return 0;
    }
    public int digit(int x, int y) {
        return (x + y) % 10;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode curr = answer;
        curr.val = digit(l1.val, l2.val);
        int carry = carry(l1.val, l2.val);
        while (true) { 
            int first = carry;
            int second = 0;           
            if (l1 != null) {
                l1 = l1.next;
                first += (l1 == null) ? 0 : l1.val;               
            }
            if (l2 != null) {
                l2 = l2.next;
                second += (l2 == null) ? 0 : l2.val;                
            }
            if (l1 == null && l2 == null && carry == 0) {
                break;
            }
            carry = carry(first, second);
           
            curr.next = new ListNode();
            curr = curr.next;
            curr.val = digit(first, second); 
        } 
        return answer;
    }
}