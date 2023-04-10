public class Q50 {
    public static int findKeyCount2(int[] arr, int size, int key) {
        int firstIndex, lastIndex;
        firstIndex = findFirstIndex(arr, 0, size - 1, key);
        lastIndex = findLastIndex(arr, 0, size - 1, key);
        return (lastIndex - firstIndex + 1);
    }

    public static int findFirstIndex(int[] arr, int start, int end, int key) {
        int mid;
        if (end < start) {
            return -1;
        }
        mid = (start + end) / 2;
        if (key == arr[mid] && (mid == start || arr[mid - 1] != key)) {
            return mid;
        }
        if (key <= arr[mid])// <= is us the number.t in sorted array.
        {
            return findFirstIndex(arr, start, mid - 1, key);
        } else {
            return findFirstIndex(arr, mid + 1, end, key);
        }
    }

    public static int findLastIndex(int[] arr, int start, int end, int key) {
        int mid;
        if (end < start) {
            return -1;
        }
        mid = (start + end) / 2;
        if (key == arr[mid] && (mid == end || arr[mid + 1] != key)) {
            return mid;
        }
        if (key < arr[mid])// <
        {
            return findLastIndex(arr, start, mid - 1, key);
        } else {
            return findLastIndex(arr, mid + 1, end, key);
        }
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int n = arr.length;
        int key = 2;
        System.out.println(findKeyCount2(arr, n, key));
    }
}
