package binarytrees;

import java.util.ArrayList;

public class LowestCommonAncestor {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

//    APPROACH 1 WITH LINEAR TIME AND SPACE COMPLEXITY
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
//        BASE CASE
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }

//        CALL TO INNER FUNCTION
        boolean foundLeft=getPath(root.left,n,path);
        boolean foundRight=getPath(root.right,n,path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
    public static Node lowestCommonAncestor(Node root, int n1, int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

//        DONO NODES KE PATH MEI SE LAST COMMON NODE NIKALNA HAI
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
//                JAISE HI PATHS MEI KOI DATA DIFFERENT HOJAYEGA MATLB COMMON ANCESTOR MILGYA HAI AT i-1 INDEX
                break;
            }
        }

        Node lca=path1.get(i-1);
        return lca;
    }

//    APPROACH 2 WITH LINEAR TIME COMPLEXITY AND CONSTANT SPACE COMPLEXITY
    public static Node lowestCommonAncestor2(Node root, int n1, int n2){
//        BASE CASE
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }

//      CALL TO INNER FUNCTION
        Node leftLCA=lowestCommonAncestor2(root.left,n1,n2);
        Node rightLCA=lowestCommonAncestor2(root.right,n1,n2);

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

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int node1=4,node2=7;
        System.out.println(lowestCommonAncestor(root,node1,node2).data);
        System.out.println(lowestCommonAncestor2(root,node1,node2).data);
    }
}
