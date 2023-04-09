public class Q35 {
    public static void APTriplets(int[] arr, int size) {
        int i, j, k;
        for (i = 1; i < size - 1; i++) { j = i - 1;
            k = i + 1;
            while (j >= 0 && k < size) {

                if (arr[j] + arr[k] == 2 * arr[i]) {
                    System.out.println("Triplet ::" + arr[j] +"    "+ arr[i] +"    "+ arr[k]);
                    k += 1;
                    j -= 1;
                } else if (arr[j] + arr[k] < 2 * arr[i])
                    k += 1;
                else
                    j -= 1;
            }
        }
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 12, 17, 22, 31, 32, 35, 42};
        APTriplets(arr, arr.length);
    }
}
