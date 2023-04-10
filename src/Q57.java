public class Q57 {
    public static int BinarySearchRotateArrayUtil(int[] arr, int start, int end, int
            key) {
        int mid;
        if (end < start) {
            return -1;
        }
        mid = (start + end) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (arr[mid] > arr[start]) {
            if (arr[start] <= key && key < arr[mid]) {
                return BinarySearchRotateArrayUtil(arr, start, mid - 1, key);
            } else {
                return BinarySearchRotateArrayUtil(arr, mid + 1, end, key);
            }} else {
            if (arr[mid] < key && key <= arr[end]) {
                return BinarySearchRotateArrayUtil(arr, mid + 1, end, key);
            } else {
                return BinarySearchRotateArrayUtil(arr, start, mid - 1, key);
            }
        }
    }
    public static int BinarySearchRotateArray(int[] arr, int size, int key) {
        return BinarySearchRotateArrayUtil(arr, 0, size - 1, key);
    }
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println(BinarySearchRotateArray(arr, n, 3));
    }
}
