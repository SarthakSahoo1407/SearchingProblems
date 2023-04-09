public class Q44 {
    public static int getMajority3(int[] arr, int size) {
        int majIndex = 0, count = 1;
        int i;
        int candidate;
        for (i = 1; i < size; i++) {
            if (arr[majIndex] == arr[i]) {
                count++;
        } else {
            count--;
        }
            if (count == 0) {
                majIndex = i;
                count = 1;
            }
        }
        candidate = arr[majIndex];
        count = 0;
        for (i = 0; i < size; i++) { if (arr[i] == candidate) {
            count++;
        }
        }
        if (count > size / 2) {
            return arr[majIndex];
        } else {
            return 0;
        }
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        System.out.println(getMajority3(arr, n));
    }
}
