package binarysearchtrees;

public class SearchInBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean search(Node root, int key){
//        BASE CASE
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
//        CALL TO INNER FUNCTIONS AND KAAM JO ISS FUNCTION CALL PR KRNA HAI
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
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

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i < values.length;i++){
            root=insert(root,values[i]);
        }
        System.out.println();

        if(search(root,1)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
