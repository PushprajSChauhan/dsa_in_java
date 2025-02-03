public class StartsWith {
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

        curr.eow=true;
    }
    public static boolean startsWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i)-'a';
            if(curr.children[index]==null){
                return false; //curr node ke children array ke index pe koi node nahi hai yaani prefix ka present letter nahi hai toh false return krenge
            }
            curr=curr.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        String prefix1="app";
        String prefix2="moon";

        for(String s:words){
            insert(s);
        }

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
