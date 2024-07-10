package binarysearchtrees;

public class AVLTrees {
    static class Node{
        int data,height;
        Node left,right;
        public Node(int data){
            this.data=data;
            height=1;
        }
    }

    public static Node root;

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }

    static int max(int a, int b){
        return (a>b)?a:b;
    }

    public static Node insert(Node root, int key){
        if(root==null){
            return new Node(key);
        }

        if(key<root.data){
            root.left=insert(root.left,key);
        }
        else if(key>root.data){
            root.right=insert(root.right,key);
        }
        else{
            return root;
//            DUPLICATE KEYS NOT ALLOWED
        }

//        UPDATE ROOT HEIGHT
        root.height=1+Math.max(height(root.left),height(root.right));

//        GET BALANCE FACTOR
        int bf=getBalance(root);

//        LL CASE
        if(bf>1 && key<root.left.data){
            return rightRotate(root);
        }
//        RR CASE
        if(bf< -1 && key>root.right.data){
            return leftRotate(root);
        }
//        LR CASE
        if(bf>1 && key>root.left.data){
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
//        RL CASE
        if(bf< -1 && key<root.right.data){
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }

//        RETURN ROOT IF AVL BALANCED
        return root;
    }

    public static Node leftRotate(Node x){
        Node y=x.right;
        Node T2=y.left;

//        PERFORM ROTATION
        y.left=x;
        x.right=T2;

//        UPDATE HEIGHTS
        x.height=max(height(x.left),height(x.right))+1;
        y.height=max(height(y.left),height(y.right))+1;

//        RETURN NEW ROOT
        return y;
    }

    public static Node rightRotate(Node y){
        Node x=y.left;
        Node T2=x.right;

//        PERFORM ROTATION
        x.right=y;
        y.left=T2;

//        UPDATE HEIGHTS
        y.height=max(height(y.left),height(y.right))+1;
        x.height=max(height(x.left),height(x.right))+1;

//        RETURN NEW ROOT
        return x;
    }

    public static int getBalance(Node root){
        if(root==null){
            return 0;
        }
        return height(root.left)-height(root.right);
    }

    public static void preorder(Node root){
//        BASE CASE
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,40);
        root=insert(root,50);
        root=insert(root,25);

        preorder(root);
    }
}
