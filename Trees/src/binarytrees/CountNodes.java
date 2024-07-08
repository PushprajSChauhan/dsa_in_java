package binarytrees;

public class CountNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int countOfNodes(Node root){
//        BASE CASE
        if(root==null){
            return 0;
        }
//        CALL TO INNER FUNCTIONS
        int leftNodesCount=countOfNodes(root.left);
        int rightNodesCount=countOfNodes(root.right);
        return leftNodesCount+rightNodesCount+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(countOfNodes(root));
    }
}
