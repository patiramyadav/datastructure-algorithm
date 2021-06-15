package org.patiram;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    public Integer data;
    public TreeNode left;
    public TreeNode right;
    TreeNode(Integer data){
        this.data = data;
    }

    public static TreeNode deserialize(String tree){
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(tree.split(",")));
        return construct(list);
    }

    static TreeNode construct(List<String> l) {
        if(l.isEmpty()) return null;
        if(l.get(0).equals("null")){
            l.remove(0);
            return  null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(l.get(0)));
        l.remove(0);
        root.left = construct(l);
        root.right = construct(l);
        return root;
    }

    public static void serialize(TreeNode r, StringBuilder sb){
        if(r==null){
            sb.append("null");
            sb.append(",");
            return;
        }
        sb.append(r.data);
        sb.append(",");
        serialize(r.left, sb);
        serialize(r.right, sb);
    }
}
