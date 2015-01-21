public class LinkedIntList {
   public ListNode front;
   
   public LinkedIntList() {
      front = null;
   }
   
   public LinkedIntList(int frontValue) {
      front = new ListNode(frontValue);
   }
   
   public LinkedIntList(ListNode node) {
      front = deepCopy(node);
   }
   
   private ListNode deepCopy(ListNode node) {
      if (node == null)
         return null;
      ListNode newNode = new ListNode(node.data);
      newNode.next = deepCopy(node.next);
      return newNode;
   }
}      