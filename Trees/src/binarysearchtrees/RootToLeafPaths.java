package binarysearchtrees;

import java.util.ArrayList;

public class RootToLeafPaths {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
//            LEFT SUBTREE
            root.left=insert(root.left,val);
        }
        else{
//            RIGHT SUBTREE
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void printPath(ArrayList<Integer> path){
        for (int i: path){
            System.out.print(i+"->");
        }
        System.out.println("Null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
//        BASE CASE
        if(root==null){
            return;
        }
//        KAAM JO ISS FUNCTION CALL PR KRNA HAI
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
//        CALL TO INNER FUNCTIONS
        printRootToLeaf(root.left,path);
        printRootToLeaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        Node root=null;

        for(int i=0;i < values.length;i++){
            root=insert(root,values[i]);
        }

        printRootToLeaf(root,new ArrayList<>());
    }
}
