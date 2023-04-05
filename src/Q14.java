import java.util.Arrays;

public class Q14 {
    public static void SumDistinct(int[] arr, int size) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < (size - 1); i++) {
            if (arr[i] != arr[i + 1]) sum += arr[i];
        }
        sum += arr[size - 1]; System.out.println(sum);
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 1, 3 };
        int n = arr.length;
        SumDistinct(arr, n);
    }
}
