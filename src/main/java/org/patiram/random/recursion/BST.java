package org.patiram.random.recursion;

import org.patiram.TreeNode;

public class BST {
    private static TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.data == val) return root;
        if(root.data>val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.deserialize("5,4,7,3,null,2,null,-1,null,9");
        System.out.println(treeNode);
        StringBuilder sb = new StringBuilder();
        TreeNode t = searchBST(treeNode, 3);
        TreeNode.serialize(t, sb);
        System.out.println(sb.toString());
    }
}
