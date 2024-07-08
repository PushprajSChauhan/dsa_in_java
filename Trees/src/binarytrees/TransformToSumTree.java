package binarytrees;

public class TransformToSumTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static int transformToSum(Node root){
//        BASE CASE
        if(root==null){
            return 0;
        }

//        CALL TO INNER FUNCTIONS
        int leftChild=transformToSum(root.left);
        int rightChild=transformToSum(root.right);

        int data=root.data;

//        FOR HANDLING THE CASE OF LEAF NODES
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.left==null?0:root.right.data;

        root.data=newLeft+leftChild+newRight+rightChild;

        return data;
    }

    public static void preorder(Node root){
//            BASE CASE
        if(root==null){
//                YA TOH TREE EXIST HI NHI KRTA HAI YA FIR LEAF NODE KO ACCESS KRRHE HAIN
            return;
        }
//            RULE 1: PRINT THE ROOT NODE OF THE TREE
        System.out.print(root.data+" ");
//            RULE 2: PRINT THE LEFT SUBTREE OF THE ROOT NODE
//            CALL TO INNER FUNCTIONS
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        transformToSum(root);
        preorder(root);
    }
}
