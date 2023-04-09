import java.util.Arrays;
public class Q27 {
    public static void ClosestPair2(int arr[], int size, int value) {
        int first = 0, second = 0;
        int start = 0;
        int stop = size - 1;
        int diff, curr;
        Arrays.sort(arr);
        diff = 9999999;
        while (start < stop) {
            curr = (value - (arr[start] + arr[stop]));
            if (Math.abs(curr) < diff) {
                diff = Math.abs(curr);
                first = arr[start];
                second = arr[stop];
            }
            if (curr == 0) {
                break;
            } else if (curr > 0) {
                start += 1;
            } else {
                stop -= 1;
            }
        }
        System.out.println("closest pair is :: " + first +", "+ second);
    }
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        ClosestPair2(arr, arr.length, 100);
    }
}
