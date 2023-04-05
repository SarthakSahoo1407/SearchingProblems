import java.util.HashSet;

public class Q04 {
    public static void printRepeating(int arr[], int size){
        HashSet<Integer> set = new HashSet<>();
        int i;
        System.out.print("Repeating Elements: ");
        for (i = 0; i < size; i++) {
            if (set.contains(arr[i])) {
                System.out.print(arr[i]+" ");
            }else{
                set.add(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,6,7,8,9,10,11,12,13,14,15,15};
        int size=arr.length;
        printRepeating(arr,size);
    }
}
