public class ListNode {
   public int data;
   public ListNode next;
   
   public ListNode() {
      this.next = null;
   }
   
   public ListNode(int value) {
      this(value, null);
   }
   
   public ListNode(int value, ListNode node) {
      this.data = value;
      this.next = node;
   }
   
   public boolean equals(Object other) {
      if (!(other instanceof ListNode))
         return false;
      ListNode otherNode = (ListNode) other;
      if (otherNode == null)
         return false;
      return this.data == otherNode.data && this.next.equals(otherNode.next);
   }
}      