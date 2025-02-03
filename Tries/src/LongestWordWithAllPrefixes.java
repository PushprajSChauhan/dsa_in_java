public class LongestWordWithAllPrefixes {
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

    public static String answer="";
    public static void longestWord(Node root, StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){ //yahi pe lexicographical order mei nodes append honge toh 'apple' ayega answer and not 'apply' even though they have same length
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>answer.length()){
                    answer=temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1); //this is backtracking step
            }
        }
    }
    public static void main(String[] args) {
        String words[]={"a","banana","app","appl","ap","apply","apple"}; //to get the lexicographically largest string reverse the for loop in longestWord method
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root,new StringBuilder(""));
        System.out.print(answer);
    }
}
