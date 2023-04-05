import java.util.Arrays;

public class Q06 {
    public static int[] removeDuplicates(int arr[],int size){
        int i,j=0;
        Arrays.sort(arr);
        for(i=1;i<size;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        int[] newArr = Arrays.copyOf(arr, j+1);
        return newArr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,6,7,8,9,10,11,12,13,14,15,15};
        int size=arr.length;
        int[] newArr = removeDuplicates(arr,size);
        System.out.println(Arrays.toString(newArr));
    }
}
