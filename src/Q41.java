public class Q41 {
    public static int getMax3(int[] arr, int size, int range) {
        int max = arr[0], maxCount = 1;
        int[] count = new int[range];
        int i;
        for (i = 0; i < size; i++) {
            count[arr[i]]++;
            if (count[arr[i]] > maxCount) {
                maxCount = count[arr[i]]; max = arr[i];
            }
        }
        return max;
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        int range = 7;
        System.out.println(getMax3(arr, n, range));
    }
}
