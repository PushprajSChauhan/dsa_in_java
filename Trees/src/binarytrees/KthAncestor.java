package binarytrees;

public class KthAncestor {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static int kthAncestor(Node root, int n, int k){
//        BASE CASE
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

//        CALL TO INNER FUNCTIONS
        int leftDist=kthAncestor(root.left,n,k);
        int rightDist=kthAncestor(root.right,n,k);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
//        KISI BHI EK SUBTREE MEI EXIST KREGI NODE TOH USSE CONSIDER KRENGE DISTANCE NIKALNE MEIN
        int max=Math.max(leftDist,rightDist);
        if(max+1 == k){
            System.out.println("Ancestor Node is "+root.data);
        }
        return max+1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int n=5, k=2;
        kthAncestor(root,n,k);
    }
}
