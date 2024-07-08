public class LetterToUppercase {
    public static String toUpperCase(String s){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                char up=Character.toUpperCase(s.charAt(i));
                sb.append(up);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hi, i am pushpraj";
        System.out.println(toUpperCase(str));
    }
}
