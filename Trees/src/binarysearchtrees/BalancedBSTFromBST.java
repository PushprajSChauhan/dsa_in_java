package binarysearchtrees;

import binarytrees.InorderTraversal;

import java.util.ArrayList;

public class BalancedBSTFromBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }

    public static Node arrayToBST(ArrayList<Integer> list, int start, int end){
//        BASE CASE
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(list.get(mid));
//        CALL TO INNER FUNCTIONS
        root.left=arrayToBST(list,start,mid-1);
        root.right=arrayToBST(list,mid+1,end);
        return root;
    }

    public static void inorder(Node root, ArrayList<Integer> inorder){
//            BASE CASE
        if(root==null){
            return;
        }
//            CALL TO INNER FUNCTIONS
//            RULE 1: ACCESS AND PRINT THE LEFT SUBTREE FIRST
        inorder(root.left,inorder);
//            RULE 2: ACCESS AND PRINT THE ROOT
        inorder.add(root.data);
//            RULE 3: ACCESS AND PRINT THE RIGHT SUBTREE
        inorder(root.right,inorder);
    }

    public static void preorder(Node root){
//        BASE CASE
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
//        CALL TO INNER FUNCTIONS
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(8);

        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

//        GET THE INORDER SEQUENCE
        ArrayList<Integer> inorder=new ArrayList<>();
        inorder(root,inorder);
//        GENERATE THE BALANCED BST FROM SORTED ARRAY
        root=arrayToBST(inorder,0,inorder.size()-1);
        preorder(root);
    }
}
