public class CountUniqueSubstrings {
    static class Node{
        Node children[]=new Node[26];
        boolean eow;
        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int index=word.charAt(level)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            curr=curr.children[index];
        }

//        traversal khtm hone pe word ke last letter pe aagye hain toh uss letter ke endOfWord ko true krdenge
        curr.eow=true;
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }

        return count+1;
    }

    public static void main(String[] args) {
        String str="ababa";

//        find all suffixes, insert them in trie and then count nodes in trie
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
