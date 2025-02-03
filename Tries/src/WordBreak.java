public class WordBreak {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

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

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true; //yaha main key ki last substring ki length agar 0 hoti hai toh sirf first part ko search krenge array mei and second part already true return krega
        }
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        String key="ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
