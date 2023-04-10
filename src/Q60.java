public class Q60 {
    public static void swapch(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void transformArrayAB1(char[] arr, int size) {
        int N = size / 2, i, j;
        for (i = 1; i < N; i++) {
            for (j = 0; j < i; j++) {
                swapch(arr, N - i + 2 * j, N - i + 2 * j + 1);
            }
        }
    }
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        int n = arr.length;
        transformArrayAB1(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
