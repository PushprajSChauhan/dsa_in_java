package binarytrees;

public class KthLevelOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static void KthLevel(Node root, int level, int k){
//        BASE CASE
        if(root==null){
            return;
        }

//        KAAM JO ISS FUNCTION CALL PAR KRNA HAI
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }

//        CALL TO INNER FUNCTIONS
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int k=2;
        KthLevel(root,1,k);
    }
}
