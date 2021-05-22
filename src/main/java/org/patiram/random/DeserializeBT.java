package org.patiram.random;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DeserializeBT {
    public TreeNode rdeserialize(List<String> l) {
        if(l.get(0).equals("null")){
            l.remove(0);
            return  null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(l.get(0)));
        l.remove(0);
        root.left = rdeserialize(l);
        root.right = rdeserialize(l);

        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<>(Arrays.asList(data_array));
        return rdeserialize(data_list);
    }

     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        DeserializeBT deserializeBT = new DeserializeBT();
        TreeNode treeNode = deserializeBT.deserialize("1,2,3,null,null,4,null,null,5,null,null,");
    }
};