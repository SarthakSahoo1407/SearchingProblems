public class Q37 {
    public static int numberOfTriangles(int[] arr, int size) { int i, j, k, count = 0;
        for (i = 0; i < (size - 2); i++) {
            for (j = i + 1; j < (size - 1); j++) {
                for (k = j + 1; k < size; k++) { if (arr[i] + arr[j] > arr[k]) count += 1;
                }
            }
        }
        return count;
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {10, 21, 22, 100, 101, 200, 300};
        System.out.println(numberOfTriangles(arr, arr.length));
    }
}
