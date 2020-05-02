package binarytree;

import java.util.*;

public class BinarySearchTree {

   public BinarySearchTreeNode insert(BinarySearchTreeNode root, int data){
       BinarySearchTreeNode node = new BinarySearchTreeNode(data);

       if(root == null){
           root = node;
       }
       else if(data <= root.data){
           root.left = insert(root.left, data);
       }
       else {
           root.right = insert(root.right, data);
       }

       return root;
   }

   public boolean search(BinarySearchTreeNode root, int data){

       if(root != null){

           if(data == root.data){
               return true;
           }

           if(data <= root.data){
               return search(root.left, data);
           }
           else{
               return search(root.right, data);
           }
       }
       return false;
   }

   public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data){
       if(root != null){
           if(data == root.data){
               //delete node here.
               if(root.left == null && root.right == null){
                   root = null;
               }
               else if(root.left == null){
                   BinarySearchTreeNode tempNode = root.right;
                   root.right = null;
                   root = tempNode;
               }
               else if (root.right == null){
                   BinarySearchTreeNode tempNode = root.left;
                   root.left = null;
                   root = tempNode;

               }
               else{
                   BinarySearchTreeNode tempNode = findMinimum(root.right);
                   root.data = tempNode.data;
                   root.right = delete(root.right, tempNode.data);
               }

               return root;
           }

           if(data <= root.data){
               root.left = delete(root.left, data);
           }
           else{
               root.right = delete(root.right, data);
           }
       }

       return root;

   }

   public int findHeight(BinarySearchTreeNode root){
       if(root == null){
           return -1;
       }
       int leftHeight = findHeight(root.left);
       int rightHeight = findHeight(root.right);

       return Math.max(leftHeight, rightHeight) + 1;
   }

   public int findDepth(BinarySearchTreeNode root, int data){
       int depth = 0;
       while(root != null){
           if(data == root.data){
               return depth;
           }
           if(data <= root.data){
               root = root.left;

           }
           else{
               root = root.right;
           }
           depth++;
       }

       return 0;
   }

   public void levelOrder(BinarySearchTreeNode root){
       Queue<BinarySearchTreeNode> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
           BinarySearchTreeNode node = queue.remove();
           System.out.print(node.data + " ");
           if(node.left != null){
               queue.add(node.left);
           }
           if(node.right != null){
               queue.add(node.right);
           }
       }
   }

   public boolean isBinarySearchTree(BinarySearchTreeNode root){

       if(root == null){
           return true;
       }

       if(root.left != null && root.left.data > root.data || root.right != null && root.right.data < root.data){
           return false;
       }

       return isBinarySearchTree(root.left) && isBinarySearchTree(root.right);
   }

   public void preOrder(BinarySearchTreeNode root){
       if(root == null){
           return;
       }

       System.out.print( root.data +" ");
       preOrder(root.left);
       preOrder(root.right);

   }

   public void inOrder(BinarySearchTreeNode root){
       if(root == null){
           return;
       }

       inOrder(root.left);
       System.out.print(root.data + " ");
       inOrder(root.right);
   }

   public void postOrder(BinarySearchTreeNode root){
       if(root == null){
           return;
       }

       postOrder(root.left);
       postOrder(root.right);

       System.out.print(root.data + " ");
   }

   public BinarySearchTreeNode findMinimum(BinarySearchTreeNode root){
       if(root == null){
           throw new IllegalArgumentException();
       }

       if(root.left == null){
           return root;
       }

       return findMinimum(root.left);
   }

   public BinarySearchTreeNode findMaximum(BinarySearchTreeNode root){
       if(root == null){
           throw new IllegalArgumentException();
       }

       if(root.right == null){
           return root;
       }

       return findMaximum(root.right);
   }



}
