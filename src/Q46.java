import java.util.Arrays;

public class Q46 {
    public static int getMedian(int[] arr, int size) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[size / 2];
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        System.out.println(getMedian(arr, n));
    }

}
