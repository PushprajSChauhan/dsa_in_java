package binarytrees;

public class MinimumDistanceBetweenNodes {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static Node lowestCommonAncestor(Node root, int n1, int n2){
//        BASE CASE
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }

//      CALL TO INNER FUNCTION
        Node leftLCA=lowestCommonAncestor(root.left,n1,n2);
        Node rightLCA=lowestCommonAncestor(root.right,n1,n2);

//        WHEN LEFT SUBTREE GAVE A VALID ANSWER BUT RIGHT SUBTREE GAVE NULL
        if(rightLCA==null){
//            YAHA AYE MATLAB N1 AND N2 DONO ROOT KE LEFT MEI HI MIL GAYE AND RIGHT MEI KOI NAHI THA N1 YA N2 MEIN SE TOH FIR KISI BHI PRESENT ROOT KA LEFT CHILD HI LCA HOGA
            return leftLCA;
        }
//        WHEN RIGHT SUBTREE GAVE A VALID ANSWER BUT LEFT SUBTREE GAVE NULL
        if(leftLCA==null){
            return rightLCA;
        }
//        AGAR LEFTLCA AND RIGHTLCA MEI SE KOI BHI NULL NAHI HAI YAANI ROOT KI DONO SUBTREES MEIN GIVEN NODES EXIST KRTI HAIN AND YEH ROOT HI UNN DONO NODES KA LCA HAI
        return root;
    }

    public static int lcaDistance(Node root, int n){
//        BASE CASE
        if(root==null){
            return -1;
        }
//        IF WE ARE ON THE SAME NODE FOR WHICH WE ARE GETTING DISTANCE UPTO LCA
        if(root.data==n){
            return 0;
        }

//        CALL TO INNER FUNCTIONS
        int leftDist=lcaDistance(root.left,n);
        int rightDist=lcaDistance(root.right,n);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(leftDist==-1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }

    public static int minDist(Node root, int n1, int n2){
        Node lca=lowestCommonAncestor(root, n1, n2);
        int dist1=lcaDistance(lca,n1);
        int dist2=lcaDistance(lca,n2);

        return dist1+dist2;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int n1=4, n2=6;
        System.out.println(minDist(root,n1,n2));
    }
}
