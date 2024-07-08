package binarysearchtrees;

public class DeleteNode {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }

    public static Node delete(Node root, int val){
        if(root.data<val){
//            NODE TO BE DELETED IS IN RIGHT SUBTREE
            root.right=delete(root.right,val);
        }
        else if(root.data>val){
//            NODE TO BE DELETED IS IN LEFT SUBTREE
            root.left=delete(root.left,val);
        }
        else{
//            FOUND THE NODE TO BE DELETED
//            CASE 1: LEAF NODE
            if(root.left==null && root.right==null){
                return null;
            }

//            CASE 2: SINGLE CHILD
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

//            CASE 3: TWO CHILDREN
            Node inSucc=findInorderSuccessor(root.right);
            root.data=inSucc.data;
            root.right=delete(root.right, inSucc.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void inorder(Node root){
//        BASE CASE
        if(root==null){
            return;
        }
//        CALL TO INNER FUNCTIONS
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
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
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        root=delete(root,5);
        System.out.println(root.data);

        inorder(root);
    }
}
