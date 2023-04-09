import java.util.Arrays;

public class Q40 {
    public static int getMax2(int[] arr, int size) {
        int max = arr[0], maxCount = 1;
        int curr = arr[0], currCount = 1;
        int i;
        Arrays.sort(arr); // Sort(arr,size);
        for (i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1]) { currCount++;
            } else {
                currCount = 1;
                curr = arr[i];
            }
            if (currCount > maxCount) {
                maxCount = currCount; max = curr;
            }
        }
    return max;
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 3, 2, 1};
        System.out.println(getMax2(arr, arr.length));
    }
}
