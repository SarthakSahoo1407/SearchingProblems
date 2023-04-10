public class Q55 {
    public static int FindRotationMaxUtil(int arr[], int start, int end) {
        /* single element case. */
        int mid;
        if (end <= start)
            return start;
        mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1])
            return mid;
        if (arr[start] <= arr[mid]) /* increasing part. */
            return FindRotationMaxUtil(arr, mid + 1, end);
        else
            return FindRotationMaxUtil(arr, start, mid - 1);
    }
    public static int FindRotationMax(int[] arr, int size) {
        return FindRotationMaxUtil(arr, 0, size - 1);
    }
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println(FindRotationMax(arr, n));
    }
}
