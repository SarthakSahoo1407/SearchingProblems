import java.util.Arrays;

public class Q32 {
    public static void findTriplet2(int arr[], int size, int value) {
        int start, stop;
        Arrays.sort(arr);
        for (int i = 0; i < size - 2; i++) {
            start = i + 1;
            stop = size - 1;
            while (start < stop) {
                if (arr[i] + arr[start] + arr[stop] == value) {
                    System.out.println("Triplet ::" + arr[i] +" "+ arr[start] +" "+ arr[stop]);
                    start += 1;
                    stop -= 1;
                } else if (arr[i] + arr[start] + arr[stop] > value)
                    stop -= 1;
                else
                    start += 1;
            }
        }
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        findTriplet2(arr, arr.length, 21);
    }
}
