public class Q42 {
    public static int getMajority(int[] arr, int size) {
        int i, j;
        int max = 0, count = 0, maxCount = 0;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                max = arr[i];
                maxCount = count;
            }
        }
        if (maxCount > size / 2) {
            return max;
        } else {
            return 0; }
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        System.out.println(getMajority(arr, n));
    }
}
