public class UniquePrefix {
    static class Node{
        Node [] children=new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            freq=1;
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            else{
                curr.children[index].freq++;
            }

            curr=curr.children[index];
        }

        curr.eow=true;
    }

    public static String findUniquePrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            prefix.append(word.charAt(i));

            if (curr.children[index].freq == 1) {
                return prefix.toString();
            }

            curr = curr.children[index];
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        for (String word : arr) {
            System.out.println("Unique Prefix of '" + word + "' is: " + findUniquePrefix(word));
        }

    }
}
