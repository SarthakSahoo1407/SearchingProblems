import java.util.HashMap;

public class Q12 {
    public static void OddCount(int[] arr, int size) {
        HashMap<Integer, Integer> ctr = new HashMap<Integer, Integer>();
        int count =0;

        for (int i = 0; i < size; i++) {
            if (ctr.containsKey(arr[i]))
                ctr.put(arr[i], ctr.get(arr[i]) + 1);
            else
                ctr.put(arr[i], 1);
        }
        for (int i = 0; i < size; i++) {
            if (ctr.containsKey(arr[i]) && (ctr.get(arr[i]) % 2 == 1)) { System.out.println(arr[i]);
                count++;
                ctr.remove(arr[i]);
            }
        }
        System.out.println("Odd count is :: " + count);
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 1, 3 };
        int n = arr.length;
        OddCount(arr, n);
    }
}
