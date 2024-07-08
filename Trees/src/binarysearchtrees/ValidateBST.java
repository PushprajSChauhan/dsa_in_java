package binarysearchtrees;

public class ValidateBST {
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

    public static boolean isValidBST(Node root,Node min, Node max){
//        BASE CASE
        if(root==null){
            return true;
        }
//        WHEN ROOT LIES IN THE RIGHT SUBTREE ITS MINIMUM WILL BE ITS PARENT WHICH SHLD BE LESS THAN THE ROOT
        if(min!=null && root.data<=min.data){
            return false;
        }
//        WHEN ROOT LIES IN THE LEFT SUBTREE ITS MAXIMUM WILL BE ITS PARENT WHICH SHLD BE MORE THAN THE ROOT
        else if(max!=null && root.data>=max.data){
            return false;
        }
//        CALL TO INNER FUNCTIONS
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    public static void main(String[] args) {
        int values[]={8,5,3,6,10,11,14};
        Node root=null;

        int values1[]={1,1,1};
        Node root1=null;

        for(int i=0;i < values.length;i++){
            root=insert(root,values[i]);
        }
        for(int i=0;i< values1.length;i++){
            root1=insert(root1,values1[i]);
        }

        System.out.println(isValidBST(root,null,null));
        System.out.println(isValidBST(root1,null,null));
    }
}
