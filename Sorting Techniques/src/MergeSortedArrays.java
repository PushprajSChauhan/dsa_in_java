public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;

        int ans[]=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                ans[k]=arr2[j];
                k++;
                j++;
            }
            else{
                ans[k]=arr1[i];
                k++;
                i++;
            }
        }
//        IF ONE OF THE ARRAYS GETS COMPLETELY TRAVERSED, COPY ELEMENTS OF ANOTHER ARRAY AS IT IS
        while(i<arr1.length){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int brr[]={2,4,6};
        int res[]=mergeSortedArrays(arr,brr);
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
