package binarysearchtrees;

public class SortedArrayToBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
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

    public static Node arrayToBST(int arr[], int start, int end){
//        BASE CASE
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
//        CALL TO INNER FUNCTIONS
        root.left=arrayToBST(arr,start,mid-1);
        root.right=arrayToBST(arr,mid+1,end);
        return root;
    }

    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root=arrayToBST(arr,0,arr.length-1);
        preorder(root);
    }
}
