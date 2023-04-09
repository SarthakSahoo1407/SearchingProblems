import java.util.Arrays;

public class Q30 {
    public static void ZeroSumTriplets2(int[] arr, int size) {
        int start, stop, i;
        Arrays.sort(arr);
        for (i = 0; i < (size - 2); i++) {
            start = i + 1; stop = size - 1;
            while (start < stop) {
                if (arr[i] + arr[start] + arr[stop] == 0) {
                    System.out.println("Triplet :: " + arr[i] +" "+ arr[start] +" "+ arr[stop]);
                    start += 1;
                    stop -= 1;
                } else if (arr[i] + arr[start] + arr[stop] > 0)
                    stop -= 1;
                else
                    start += 1;
            }
        }
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        ZeroSumTriplets2(arr, arr.length);
    }
}
