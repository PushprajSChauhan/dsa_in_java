import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
//        ISS STACK KE ANDAR INDEXES KO STORE KRNA HAI NAA KI ARRAY ELEMENTS KO
        int nextGreater[]=new int [arr.length];

        for(int i=arr.length-1;i>=0;i--){
//            STEP 1: RUN WHILE LOOP
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
//            STEP 2: CHECK IF STACK IS EMPTY OR TOP ELEMENT IS GREATER
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
//                HERE THE TOP ELEMENT OF STACK IS MORE THAN THE ARRAY ELEMENT SO WE WILL PUT THE NUMBER AT THAT INDEX IN NEXTGREATER ARRAY
                nextGreater[i]=arr[s.peek()];
            }
//            STEP 3: PUSH ARRAY ELEMENT IN STACK
            s.push(i);
        }
        for(int i:nextGreater){
            System.out.print(i+",");
        }
//        WE CAN CREATE MULTIPLE VARIATIONS FOR THE SAME QUESTION
//        SOME OF THESE VARIATIONS CAN BE:
//        NEXT GREATER IN LEFT, NEXT SMALLER IN RIGHT, NEXT SMALLER IN LEFT
//        FOR THE FIRST TYPE, THE FOR LOOP WILL BE REVERSED
//        FOR THE SECOND TYPE THE COMPARISON CONDITION IN THE WHILE LOOP WILL BE REVERSED
//        FOR THE THIRD TYPE THE FOR LOOP AND THE COMPARISON CONDITION IN WHILE LOOP WILL BE REVERSED
    }
}
