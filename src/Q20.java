public class Q20 {
    public static boolean FindDifference(int arr[], int size, int value){
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Math.abs(arr[i] - arr[j]) == value) {
                    System.out.println("Pair is:: " + arr[i] + " & " + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int value = 2;
        FindDifference(arr, n, value);
    }
}
