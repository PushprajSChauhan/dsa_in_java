package binarytrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static class Info{
        Node node;
        int horDist;
        public Info(Node node, int hd){
            this.node=node;
            this.horDist=hd;
        }
    }
    public static void topView(Node root){
//        QUEUE FOR LEVEL ORDER TRAVERSAL
        Queue<Info> queue=new LinkedList<>();
        HashMap<Integer, Node> map=new HashMap<>();
        int min=0,max=0;

        queue.add(new Info(root,0));
        queue.add(null);

        while(!queue.isEmpty()){
            Info current=queue.remove();
//            CHECK WHETHER NODE RECEIVED FROM QUEUE IS A NULL NODE WHICH IMPLIES THAT EITHER LOOP HAS ENDED OR TRAVERSAL IS COMPLETE
            if(current==null){
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                if(!map.containsKey(current.horDist)){
//                KEY IS OCCURING FOR THE FIRST TIME DURING TRAVERSAL
                    map.put(current.horDist,current.node);
                }

                if(current.node.left!=null){
                    queue.add(new Info(current.node.left, current.horDist-1));
                    min=Math.min(min, current.horDist-1);
                }

                if(current.node.right!=null){
                    queue.add(new Info(current.node.right, current.horDist+1));
                    max=Math.max(max, current.horDist+1);
                }
            }
        }

//        NOW THE LEVEL ORDER TRAVERSAL AND MAP IS COMPLETE AND WE WILL PRINT THE DATA FROM THE MAP
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        topView(root);
    }
}
