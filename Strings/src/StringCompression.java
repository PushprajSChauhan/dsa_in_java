public class StringCompression {
    public static String compress(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
//            DONO LOOPS KUL MILAKE ARRAY KI LENGTH TAK HI TRAVERSE KRENGE ISLIYE TIME COMPLEXITY HOGI O(n)
            sb.append(s.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aabbbccdddd";
        System.out.println(compress(str));
    }
}
