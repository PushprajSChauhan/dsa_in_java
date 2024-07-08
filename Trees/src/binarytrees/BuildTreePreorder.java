package binarytrees;

public class BuildTreePreorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int nodes[]){
//            YAHA SE BINARY TREE BANAKE USKA ROOT NODE RETURN KRENGE
            index++;
            if(nodes[index]==-1){
//                AB NULL NODE KA KOI LEFT AND RIGHT SUBTREE NAHI HOTA HAI ISLIYE YAHI SE RETURN KRDENGE
                return null;
            }
            Node newNode=new Node(nodes[index]);
//            ISS NAYE NODE KO TREE MEI ADD KRNE KELIYE PHLE USKE LEFT AND RIGHT SUBTREE KO BANAYENGE AND THEN USSE JOIN KRDENGE TREE MEI
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
