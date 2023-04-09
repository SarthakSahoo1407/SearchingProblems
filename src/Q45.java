public class Q45 {
    public static int FirstIndex(int arr[], int size, int low, int high, int value) {
        int mid=0;
        if (high >= low)
            mid = (low + high) / 2;

        if ((mid == 0 || arr[mid - 1] < value) && (arr[mid] == value))
            return mid;
        else if (arr[mid] < value)
            return FirstIndex(arr, size, mid + 1, high, value);
        else
            return FirstIndex(arr, size, low, mid - 1, value);
    }
    public static boolean isMajority(int arr[], int size) {
        int i;
        int majority = arr[size / 2];
        i = FirstIndex(arr, size, 0, size - 1, majority);

        if (((i + size / 2) <= (size - 1)) && arr[i + size / 2] == majority)
            return true;
        else
            return false;
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        System.out.println(isMajority(arr, n));
    }
}

