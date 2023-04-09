import java.util.Arrays;

public class Q38 {
    public static int numberOfTriangles2(int[] arr, int size) {
        int i, j, k, count = 0;
        Arrays.sort(arr);
        for (i = 0; i < (size - 2); i++) {
            k = i + 2;
            for (j = i + 1; j < (size - 1); j++) {
                while (k < size && arr[i] + arr[j] > arr[k])
                    k += 1;
                count += k - j - 1;
            }
        }
        return count;
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {10, 21, 22, 100, 101, 200, 300};
        System.out.println(numberOfTriangles2(arr, arr.length));
    }
}
