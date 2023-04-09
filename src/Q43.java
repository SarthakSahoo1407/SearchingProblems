import java.util.Arrays;
public class Q43 {
    public static int getMajority2(int[] arr, int size) {
        int majIndex = size / 2, count = 1;
        int i;
        int candidate;
        Arrays.sort(arr); // Sort(arr,size);
        candidate = arr[majIndex];
        count = 0;
        for (i = 0; i < size; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > size / 2) {
            return arr[majIndex];
        } else {
            return Integer.MIN_VALUE;
        }
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        System.out.println(getMajority2(arr, n));
    }

}
