public class Q13 {
    public static void OddCount(int[] arr, int size) {
        int xorSum = 0;
        int first = 0;
        int second = 0;
        int setBit;
        int count = 0;
        for (int i = 0; i < size; i++)
            xorSum = xorSum ^ arr[i];
        setBit = xorSum & ~(xorSum - 1);

        for (int i = 0; i < size; i++) {
            if ((arr[i] & setBit) != 0)
                first ^= arr[i];
        else
            second ^= arr[i];
        }
        System.out.println(first + second);
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 1, 3 };
        int n = arr.length;
        OddCount(arr, n);
    }
}
