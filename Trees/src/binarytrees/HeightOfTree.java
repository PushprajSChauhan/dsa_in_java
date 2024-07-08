package binarytrees;

public class HeightOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static int heightOfTree(Node root){
//            BASE CASE
        if(root==null){
            return 0;
        }
//            CALL TO INNER FUNCTIONS
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(heightOfTree(root));
    }
}
