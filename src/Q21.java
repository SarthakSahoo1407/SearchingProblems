import java.util.Arrays;

public class Q21 {
    public static boolean FindDifference2(int arr[], int size, int value) {
        int first = 0;
        int second = 0;
        int diff;
        Arrays.sort(arr);
        while (first < size && second < size) {
            diff = Math.abs(arr[first] - arr[second]);
            if (diff == value) {
                System.out.println("Pair is::" + arr[first] + " & " + arr[second]); return true;
            } else if (diff > value)
                first += 1;
            else
                second += 1;
        }
        return false;
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int value = 2;
        FindDifference2(arr, n, value);
    }
    
}
