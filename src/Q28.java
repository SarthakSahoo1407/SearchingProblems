import java.util.Arrays;

public class Q28 {
    public static boolean SumPairRestArray(int[] arr, int size){
        int total, low, high, curr, value;
        Arrays.sort(arr);
        total = 0;
        for (int i = 0; i < size; i++) total += arr[i];
        value = total / 2;
        low = 0;
        high = size - 1;
        while (low < high) {
            curr = arr[low] + arr[high];
            if (curr == value) {
                System.out.println("Pair is :: " + arr[low] + arr[high]); return true;
            } else if (curr < value)
                low += 1;
            else
                high -= 1;
        }
        return false;
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        System.out.println(SumPairRestArray(arr, arr.length));
    }
}
