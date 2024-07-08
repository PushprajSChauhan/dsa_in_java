public class ArrayAsArgument {
    public static void update(int arr[],int nonChangeable){
        nonChangeable=10;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }

    public static void main(String[] args) {
        int marks[]={97,89,70};
        int unChangeable=40;
        update(marks,unChangeable);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(unChangeable);
//        HERE THE int VARIABLE WAS PASSED BY VALUE SO IT IS NOT CHANGED
//        BUT THE ARRAY WAS PASSED BY REFERENCE SO ITS VALUES GOT UPDATED
    }
}
