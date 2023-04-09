import java.util.Arrays;

public class Q22 {
    public static int findMinDiff(int[] arr, int size) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i + 1] - arr[i] < minDiff) {
                minDiff = arr[i + 1] - arr[i];
            }
        }
        return minDiff;
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = { 1,9,4,207,25,20,28 };
        int n = arr.length;
        System.out.println("Minimum difference is:: " + findMinDiff(arr, n));
    }
}
