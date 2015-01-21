#include <iostream>
using namespace std;

class TreeNode;

typedef TreeNode * node_ptr;

class TreeNode {
   public:
      int data;
      node_ptr left;
      node_ptr right;
      TreeNode();
      TreeNode(int);
      TreeNode(int, node_ptr, node_ptr);
};

TreeNode::TreeNode() {
   data = 0;
   left = NULL;
   right = NULL;
}

TreeNode::TreeNode(int value) {
   data = value;   
   left = NULL;   
   right = NULL;
}

TreeNode::TreeNode(int value, node_ptr leftNode, node_ptr rightNode) {
   data = value;   
   left = leftNode;
   right = rightNode;
}

class BinaryTree {
   void insert(int, node_ptr);
   int highestNumber(node_ptr);
   void printInorder(node_ptr);
   public:
      node_ptr overallRoot;
      BinaryTree();
      void insert(int);
      int highestNumber();
      void printInorder();
};

BinaryTree::BinaryTree() {
   overallRoot = NULL;
}

void BinaryTree::insert(int val) {
   if (overallRoot == NULL) {
      overallRoot = new TreeNode(val);
      return;
   }
   insert(val, overallRoot);
}

void BinaryTree::insert(int val, node_ptr node) {
   if (val < node->data) {
      if (node->left != NULL) {
         insert(val, node->left);
      }
      else {
         node->left = new TreeNode(val);
      }
   }
   else if (val >= node->data) {
      if (node->right != NULL) {
         insert(val, node->right);
      }
      else {
         node->right = new TreeNode(val);
      }   
      
   } 
}

int BinaryTree::highestNumber() {
   return highestNumber(overallRoot);
}

int BinaryTree::highestNumber(node_ptr node) {
   if (node->right == NULL)
      return node->data;
   return highestNumber(node->right);
}      

void BinaryTree::printInorder() {
   printInorder(overallRoot);
   cout << "\n";
}

void BinaryTree::printInorder(node_ptr node) {
   if (node == NULL)
      return;
   if (node->left != NULL) {
      printInorder(node->left);
   }
   
   cout << node->data << " ";
   
   if (node->right != NULL) {
      printInorder(node->right);
   }
}      

int main() {
   BinaryTree i = BinaryTree();
}