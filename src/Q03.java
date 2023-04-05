import java.util.Arrays;

public class Q03 {
    public static void printRepeating(int arr[], int size){
        int i;
        Arrays.sort(arr);
        System.out.print("Repeating Elements: ");
        for (i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,6,7,8,9,10,11,12,13,14,15,15};
        int size=arr.length;
        printRepeating(arr,size);
    }
}
