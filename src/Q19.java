import java.util.HashSet;

public class Q19 {
    public static boolean FindPair3(int[] arr, int size, int value){
        HashSet<Integer> hs = new HashSet<Integer>();
        int i;
        for (i = 0; i < size; i++) {
            if (hs.contains(value - arr[i])) {
                System.out.println("The pair is : " + arr[i] + " , " + (value - arr[i]));
                return true;
            }
            hs.add(arr[i]);
        }
        return false;
    }
// Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int value = 17;
        FindPair3(arr, n, value);
    }
}
