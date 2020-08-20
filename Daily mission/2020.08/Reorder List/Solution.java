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
    public void reorderList(ListNode head) {
        ListNode front = head;
        ListNode pre = head;
        ListNode tail = head;
        if(head == null || head.next == null){
            return;
        }
        while(tail.next != null && tail.next.next != null){
            front = front.next;
            tail = tail.next.next;
        }
        tail = front.next;
        front.next = null;
        ListNode temp = tail;
        pre = null;
        ListNode s;
        while (tail != null) {
            s = tail.next;
            tail.next = pre;
            pre = tail;
            tail = s;
        }
        tail = pre;
        front = head;
        while(front!= null && tail!= null){
            pre = tail.next;
            tail.next = front.next;
            front.next = tail;
            tail = pre;
            front = front.next.next;
        }
    }
}
