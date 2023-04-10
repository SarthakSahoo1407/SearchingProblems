public class Q54 {
    public static int RotationMaxUtil(int arr[], int start, int end) {
        int mid;
        if (end <= start) {
            return arr[start];
        }
        mid = (start + end) / 2;
        if (arr[mid] > arr[mid + 1])
            return arr[mid];
        if (arr[start] <= arr[mid]) /* increasing part. */
            return RotationMaxUtil(arr, mid + 1, end);
        else
            return RotationMaxUtil(arr, start, mid - 1);
    }
    public static int RotationMax(int[] arr, int size) {
        return RotationMaxUtil(arr, 0, size - 1);
    }
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println(RotationMax(arr, n));
    }
}
