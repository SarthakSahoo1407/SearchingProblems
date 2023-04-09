public class Q26 {
    public static void ClosestPair(int arr[], int size, int value) {
        int diff = 999999;
        int first = -1;
        int second = -1;
        int curr;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                curr = Math.abs(value - (arr[i] + arr[j]));
                if (curr < diff) {
                    diff = curr;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        System.out.println("closest pair is ::" + first +", " + second);
    }
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        ClosestPair(arr, arr.length, 100);
    }
}
