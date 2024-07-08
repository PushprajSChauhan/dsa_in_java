import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public static void printNonRepeating(String s){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
//            CHECK WHETHER THE FIRST NON-REPEATING CHARACTER EXISTS ON THE FRONT OF QUEUE
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
//            YAHA AYE HAIN MTLB YA TOH QUEUE KHALI HOGYI HAI YA FIR FIRST NON-REPEATING ELEMENT MILGYA HAI AT FRONT OF QUEUE
            if(q.isEmpty()){
                System.out.print("-1 ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        printNonRepeating(str);
    }
}
