package binarysearchtrees;

import java.util.ArrayList;

public class MergeBSTs {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> arr){
//        BASE CASE
        if(root==null){
            return;
        }

        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }

    public static Node createBST(ArrayList<Integer> list, int start, int end){
//        BASE CASE
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(list.get(mid));
//        CALL TO INNER FUNCTIONS
        root.left=createBST(list,start,mid-1);
        root.right=createBST(list,mid+1,end);
        return root;
    }

    public static Node mergeBST(Node root1, Node root2){
//        STEP 1: GET INORDER SEQUENCE FOR BOTH THE BSTs
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root1,arr1);
        inorder(root2,arr2);

//        MERGE THE LISTS
        int i=0,j=0;
        ArrayList<Integer> finalList=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalList.add(arr1.get(i));
                i++;
            }
            else{
                finalList.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalList.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalList.add(arr2.get(j));
            j++;
        }

//        CREATE BALANCED BST USING THIS SORTED LIST
        return createBST(finalList,0,finalList.size()-1);
    }

    public static void preorder(Node root){
//        BASE CASE
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        Node root=mergeBST(root1,root2);
        preorder(root);
    }
}
