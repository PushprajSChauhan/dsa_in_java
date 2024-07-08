import java.util.Stack;

public class MaxAreaInHistogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nextSmallRight[]=new int[arr.length];
        int nextSmallLeft[]=new int[arr.length];
//        GET THE NEXT SMALLER RIGHT FOR THE BAR
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
//            STEP 1: RUN WHILE LOOP
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
//            STEP 2: CHECK IF STACK IS EMPTY OR TOP ELEMENT IS SMALLER
            if(s.isEmpty()){
                nextSmallRight[i]=arr.length;
            }
            else{
//                HERE THE TOP ELEMENT OF STACK IS LESS THAN THE ARRAY ELEMENT SO WE WILL PUT THE NUMBER AT THAT INDEX IN NEXT SMALL RIGHT ARRAY
                nextSmallRight[i]=s.peek();
            }
//            STEP 3: PUSH ARRAY ELEMENT IN STACK
            s.push(i);
        }

//        GET THE NEXT SMALLER LEFT FOR THE BAR
        s=new Stack<>();
        for(int i=0;i< arr.length;i++){
//            STEP 1: RUN WHILE LOOP
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                s.pop();
            }
//            STEP 2: CHECK IF STACK IS EMPTY OR TOP ELEMENT IS SMALLER
            if(s.isEmpty()){
                nextSmallLeft[i]=-1;
            }
            else{
//                HERE THE TOP ELEMENT OF STACK IS LESS THAN THE ARRAY ELEMENT SO WE WILL PUT THE NUMBER AT THAT INDEX IN NEXT SMALL LEFT ARRAY
                nextSmallLeft[i]=s.peek();
            }
//            STEP 3: PUSH ARRAY ELEMENT IN STACK
            s.push(i);
        }
//        CALCULATE AREA FOR THE BAR
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nextSmallRight[i]-nextSmallLeft[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("Max Rectangle Area in Histogram is "+maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3}; //BAR HEIGHTS IN HISTOGRAM
        maxArea(arr);
    }
}
