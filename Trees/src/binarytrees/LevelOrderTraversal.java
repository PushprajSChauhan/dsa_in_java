package binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
//            YAHA SE BINARY TREE BANAKE USKA ROOT NODE RETURN KRENGE
            index++;
            if (nodes[index] == -1) {
//                AB NULL NODE KA KOI LEFT AND RIGHT SUBTREE NAHI HOTA HAI ISLIYE YAHI SE RETURN KRDENGE
                return null;
            }
            Node newNode = new Node(nodes[index]);
//            ISS NAYE NODE KO TREE MEI ADD KRNE KELIYE PHLE USKE LEFT AND RIGHT SUBTREE KO BANAYENGE AND THEN USSE JOIN KRDENGE TREE MEI
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
//                YAHA DEQUEUE WALA KAAM KRENGE SBHI NODES KO PRINT KRWANE KELIYE
                Node currNode=q.remove();
                if(currNode==null){
//                    YAHA AYE HAIN MTLB TREE KA LEVEL CHANGE HOGA AB
                    System.out.println();
                    if(q.isEmpty()){
//                        YAHA AYE HAIN MATLB POORA TREE TRAVERSE HO CHUKA HAI AND AB QUEUE KHALI HAI
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.levelorder(root);
    }
}
