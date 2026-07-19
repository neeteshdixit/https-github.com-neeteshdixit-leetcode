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

        // Agar list empty hai to wahi return kar do
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current != null && current.next != null) {

            // Duplicate mila
            if (current.val == current.next.val) {

                // Duplicate node ko skip kar do
                current.next = current.next.next;

            } else {

                // Duplicate nahi mila to aage badho
                current = current.next;
            }
        }

        return head;
    }
}