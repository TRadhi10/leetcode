class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null ||left == right){
      return head;
    }
    ListNode dummy = new ListNode(0, head);
    ListNode prev = dummy;

    for (int i = 0; i < left- 1; ++i)
      prev = prev.next;

    ListNode tail = prev.next;

    for (int i = 0; i < right - left; ++i) {
      ListNode curr = tail.next;
      tail.next = curr.next;
      curr.next = prev.next;
      prev.next = curr;
    }

    return dummy.next;
  }
}
