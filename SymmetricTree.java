package com.company;

import com.sun.source.tree.Tree;

//TC: O(n)
//SC: O(1) without recursion stack space
//with recursion stack space: O(h); h is height of tree

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class SymmetricTree {

    private boolean helper(TreeNode t1, TreeNode t2){

        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && helper(t1.left, t2.right) && helper(t1.right, t2.left);

    }

    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }

    public static void main(String args[]){
        SymmetricTree obj = new SymmetricTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        System.out.println("Tree is symmetric: " + obj.isSymmetric(root));
    }

}