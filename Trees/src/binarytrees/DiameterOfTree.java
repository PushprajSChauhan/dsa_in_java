package binarytrees;

public class DiameterOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static int heightOfTree(Node root){
//        BASE CASE
        if(root==null){
            return 0;
        }
//        CALL TO INNER FUNCTIONS
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static int diameter(Node root){
//            BASE CASE
        if(root==null){
            return 0;
        }
//        CALL TO INNER FUNCTIONS
        int leftDiameter=diameter(root.left);
        int leftHeight=heightOfTree(root.left);
        int rightDiameter=diameter(root.right);
        int rightHeight=heightOfTree(root.right);

        int selfDiameter=leftHeight+rightHeight+1;
        return Math.max(Math.max(leftDiameter,rightDiameter),selfDiameter);
    }
    static class Info{
        int diameter;
        int height;
        public Info(int dia, int ht){
            this.diameter=dia;
            this.height=ht;
        }
    }
    public static Info diameter1(Node root){
//        BASE CASE
        if(root==null){
            return new Info(0,0);
        }
//        CALL TO INNER FUNCTIONS
        Info leftInfo=diameter1(root.left);
        Info rightInfo=diameter1(root.right);
//        YAHA EK HI BAAR MEI HAR NODE KELIYE USKI HEIGHT AND DIAMETER NIKAL RHE HAIN AND EK HI FUNCTION KO CALL KRRHE HAIN RECURSIVELY

        int diameter=Math.max(leftInfo.height+rightInfo.height+1,Math.max(leftInfo.diameter,rightInfo.diameter));
        int height= Math.max(leftInfo.height,rightInfo.height)+1;

        return new Info(diameter,height);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter(root));
        Info obj=diameter1(root);
        System.out.println(obj.diameter);
    }
}
