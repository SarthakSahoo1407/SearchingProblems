public class Q49 {
    public static int findKeyCount(int[] arr, int size, int key) {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        int key = 1;
        System.out.println(findKeyCount(arr, n, key));
    }
}
