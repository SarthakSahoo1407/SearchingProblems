public class Q17 {
    public static boolean FindPair(int[] arr, int size, int value) {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if ((arr[i] + arr[j]) == value) {
                    System.out.println("Pair is: " + arr[i] + "," + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int value = 17;
        FindPair(arr, n, value);
    }
}
