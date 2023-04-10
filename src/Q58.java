public class Q58 {
    public static int minAbsDiffAdjCircular(int[] arr, int size) {
        int diff = 9999999;
        if (size < 2)
            return -1;
        for (int i = 0; i < size; i++)
            diff = Math.min(diff, Math.abs(arr[i] - arr[(i + 1) % size]));
        return diff;
    }
    public static void main(String[] args) {
        int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
        int n = arr.length;
        System.out.println(minAbsDiffAdjCircular(arr, n));
    }
}
