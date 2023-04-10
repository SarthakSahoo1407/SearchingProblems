public class Q53 {
    public static int BinarySearch01(int[] arr, int size) {
        if (size == 1 && arr[0] == 1) {
            return 0;
        }
        return BinarySearch01Util(arr, 0, size - 1);
    }
    public static int BinarySearch01Util(int[] arr, int start, int end) {
        int mid;
        if (end < start) {
            return -1;
        }
        mid = (start + end) / 2;
        if (1 == arr[mid] && 0 == arr[mid - 1]) {
            return mid;
        }
        if (0 == arr[mid]) {
            return BinarySearch01Util(arr, mid + 1, end);
        } else {
            return BinarySearch01Util(arr, start, mid - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        int n = arr.length;
        System.out.println(BinarySearch01(arr, n));
    }
}
