class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        int middle = 0;
        ListNode current = head;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        middle = len / 2;

        for (int i = 0; i < middle; i++) {
            current = current.next;
        }

        return current;
    }
}