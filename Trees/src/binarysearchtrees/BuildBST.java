package binarysearchtrees;

public class BuildBST {
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

    public static void inorder(Node root){
//        BASE CASE
        if(root==null){
            return;
        }
//        CALL TO INNER FUNCTIONS
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i < values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
    }
}
