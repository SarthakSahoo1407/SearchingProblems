import java.util.Arrays;

public class Q18 {
    public static boolean FindPair2(int[] arr, int size, int value){
        int first = 0, second = size - 1;
        int curr;
        Arrays.sort(arr);
        while (first < second) {
            curr = arr[first] + arr[second];
            if (curr == value) {
                System.out.println("Pair is: " + arr[first] + "," + arr[second]);
                return true;
            } else if (curr < value) {
                first++;
            } else {
                second--;
            }
        }
        return false;
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int value = 17;
        FindPair2(arr, n, value);
    }
}
