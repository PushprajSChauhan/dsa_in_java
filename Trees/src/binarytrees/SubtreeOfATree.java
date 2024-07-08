package binarytrees;

public class SubtreeOfATree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static boolean isIdentical(Node matchNode, Node subRoot){
//        ISS METHOD SE ROOT AND SUBROOT DONO SE NIKALNE WALE TREE KO IDENTICAL HONE KELIYE CHECK KRENGE
        if(matchNode == null && subRoot == null){
//            AGAR DONO NODES NULL HONGE YANI IDENTICAL HAIN TREE AND SUBTREE
            return true;
        }
        else if(matchNode==null || subRoot==null || matchNode.data!=subRoot.data){
//            AGAR EK BHI TREE NULL HOGYA AKELE AUR DOOSRE TREE MEI NODES HAIN MTLB NON-IDENTICAL KA CASE HAI
//            YA FIR NODES HAIN BUT UNKA DATA ALAG HAI TOH BHI NON-IDENTICAL KA CASE RHEGA
            return false;
        }

//        AB LEFT AND RIGHT SUBTREES OF MAIN TREE KE HISAB SE SEARCH KRENGE NON-IDENTICAL CASE KELIYE
        if(!isIdentical(matchNode.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(matchNode.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subRoot){
//        ISS METHOD SE SUBROOT KO MAIN TREE MEI SEARCH KRENGE
//        BASE CASE
        if(root==null){
//            SUBROOT KA DATA MATCH HI NAHI KIYA MAIN TREE KE PARTICULAR SUBTREE KE ROOT SE TOH FALSE RETURN KRENGE
//            YA FIR ROOT NODE KO SUBROOT NODE SE MATCH KRTE HUE AGAR TREE KHALI HOGYA YA MAIN TREE KE LEAF NODE KE CHILD PE CHALE GYE TOH RETURN KRENGE FALSE
            return false;
        }

//        SEARCH FOR THE SUBROOT IN MAIN TREE
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
//                YAHA AYE HAIN MATLB ROOTS MATCH HOGYI HAIN AND UNSE NIKALNE WALE TREES BHI IDENTICAL HAIN
                return true;
            }
        }

//        CALL TO INNER FUNCTIONS
//        AGAR ROOT NODE PE SUBROOT NAHI MILA TOH MAIN TREE KE LEFT AND RIGHT SUBTREES MEI SEARCH KRENGE SUBROOT KO

        boolean leftAns=isSubtree(root.left,subRoot);
//        AB ROOT AUR SUBROOT TOH MATCH HOGYI HAI ISLIYE TRUE RETURN KRENGE AGR LEFT MEI SUBTREE EXIST KREGA TOH VRNA RETURN KRENGE FALSE

        boolean rightAns=isSubtree(root.right,subRoot);
//        AB ROOT AUR SUBROOT TOH MATCH HOGYI HAI ISLIYE TRUE RETURN KRENGE AGR RIGHT MEI SUBTREE EXIST KREGA TOH VRNA RETURN KRENGE FALSE

//        MAIN TREE KE KISI BHI PART MEI DIYA GAYA SUBTREE EXIST KREGA TOH TRUE RETURN KRENGE
        return leftAns || rightAns;
    }

    public static void main(String[] args) {
//        MAIN TREE WITH ROOT 1
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

//        SUBTREE TO LOOK FOR IN THE MAIN TREE
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);

        System.out.println(isSubtree(root,subRoot));
    }
}
