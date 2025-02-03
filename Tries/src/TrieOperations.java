public class TrieOperations {

    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node(); //this root node is always empty and every new letter of a new word is being stored in its array

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

    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int index=key.charAt(level)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }

//        traversal khtm hone pe word ke last letter pe aagye hain toh uss letter ke endOfWord ko true krdenge
        return curr.eow==true;
    }

    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
    }
}