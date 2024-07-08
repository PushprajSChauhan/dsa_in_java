package binarysearchtrees;

public class PrintInRange {
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

    public static void printInRange(Node root, int k1, int k2){
//        BASE CASE
        if(root==null){
            return;
        }
//        CALL TO INNER FUNCTIONS
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printInRange(root.right,k1,k2);
        }
        else{
            printInRange(root.left,k1,k2);
        }
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0;i < values.length;i++){
            root=insert(root,values[i]);
        }

        printInRange(root,5,12);
    }
}
