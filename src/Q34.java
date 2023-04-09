import java.util.Arrays;

public class Q34 {
    public static void SmallerThenTripletCount(int arr[], int size, int value) {
        int start, stop;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < (size - 2); i++) { start = i + 1;
            stop = size - 1;
            while (start < stop) {
                if (arr[i] + arr[start] + arr[stop] >= value) stop -= 1;
                else {
                    count += stop - start;
                    start += 1;
                }
            }
        } System.out.println(count);
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7};
        SmallerThenTripletCount(arr, arr.length, 12);
    }
}
