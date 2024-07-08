package binarysearchtrees;

public class MirrorBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
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

    public static Node mirror(Node root){
//        BASE CASE
        if(root==null){
            return null;
        }
//        CALL TO INNER FUNCTIONS
        Node newLeft=mirror(root.left);
        Node newRight=mirror(root.right);

        root.left=newRight;
        root.right=newLeft;

        return root;
    }

    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);

        root=mirror(root);
        inorder(root);
    }
}
