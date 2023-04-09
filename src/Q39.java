public class Q39 {
    public static int getMax(int[] arr, int size) {
        int i, j;
        int max = arr[0], count = 1, maxCount = 1;
        for (i = 0; i < size; i++) {
            count = 1;
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                max = arr[i];
                maxCount = count;
            }
        }
        return max;
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 3, 2, 1};
        System.out.println(getMax(arr, arr.length));
    }
}
