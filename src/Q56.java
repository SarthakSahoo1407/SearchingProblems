public class Q56 {
    public static int CountRotation(int[] arr, int size) {
        int maxIndex = Q55.FindRotationMaxUtil(arr, 0, size - 1);
        return (maxIndex + 1) % size;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println(CountRotation(arr, n));
    }

}
