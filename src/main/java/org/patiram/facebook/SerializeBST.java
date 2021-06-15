package org.patiram.facebook;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SerializeBST {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        rs(root, sb);
        return sb.toString();
    }

    void rs(TreeNode r, StringBuilder sb){
        if(r==null){
            sb.append("null");
            sb.append(",");
            return;
        }
        sb.append(r.val);
        sb.append(",");
        rs(r.left, sb);
        rs(r.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        List<String> l = new LinkedList<>(Arrays.asList(s));
        return rd(l);
    }

    TreeNode rd(List<String> l){
        if(l.get(0).equals("null")){
            l.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(l.get(0)));
        l.remove(0);
        root.left = rd(l);
        root.right = rd(l);
        return root;
    }

    class TreeNode {
       int val;
        TreeNode left;
          TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
