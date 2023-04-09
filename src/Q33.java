import java.util.Arrays;

public class Q33 {
    public static void ABCTriplet(int[] arr, int size) {
        int start, stop;
        Arrays.sort(arr);
        for (int i = 0; i < (size - 2); i++) { start = i + 1;
            stop = size - 1;
            while (start < stop) {
                if (arr[i] == arr[start] + arr[stop]) {
                    System.out.println("Triplet ::%d, %d, %d" + arr[i]+" " + arr[start] +" "+ arr[stop]);
                    start += 1;
                    stop -= 1;
                } else if (arr[i] > arr[start] + arr[stop])
                    stop -= 1;
                else
                    start += 1;
            }
        }
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 10, 8};
        ABCTriplet(arr, arr.length);
    }
}
