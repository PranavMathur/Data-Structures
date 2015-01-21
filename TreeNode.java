public class TreeNode implements Comparable{
   public int data;
   public TreeNode left;
   public TreeNode right;
   
   public TreeNode() {
      this.left = null;
      this.right = null;
   }
   
   public TreeNode(int value) {
      this(value, null, null);
   }
   
   public TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
      this.data = value;
      this.left = leftNode;
      this.right = rightNode;
   }  
   
   public TreeNode deepCopy() {
      return deepCopy(this);
   }   
   
   public TreeNode deepCopy(TreeNode node) {
      if (node == null)
         return null;
      TreeNode newNode = new TreeNode(node.data);
      newNode.left = deepCopy(node.left);
      newNode.right = deepCopy(node.right);
      return newNode;
   }
   
   public String toString() {
      return "" + this.data;
   }
   
   public boolean equals(Object object) {
      if (!(object instanceof TreeNode))
         return false;
      if (object == null)
         return false;   
      TreeNode node = (TreeNode) object;
      return (this.data == node.data) && ((this.left != null) ? this.left.equals(node.left) : (node.left == null)) && ((this.right != null) ? this.right.equals(node.right) : (node.right == null));
   }
   
   public int compareTo(Object obj) {
      if (!(obj instanceof TreeNode))
         throw new ClassCastException();
      TreeNode otherNode = (TreeNode) obj;
      return this.data - otherNode.data;
   }      
      
}   