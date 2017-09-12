package com.tree;

public class SymmetricTree {
	 static TreeNode root;
	public static void main(String[] args) {
		root = new TreeNode(20);
		root.left = new TreeNode(10);
		root.right = new TreeNode(10);
		System.out.println(isSymmetric(root));

	}

    static boolean isMirror(TreeNode node1, TreeNode node2) 
    {
        if (node1 == null && node2 == null)
            return true;
  
        if (node1 != null && node2 != null && node1.val == node2.val)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));
  
        return false;
    }
  
    static boolean isSymmetric(TreeNode node) 
    {
        return isMirror(root, root);
    }

}
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
