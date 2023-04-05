import java.util.HashSet;

public class Q09 {
    public static int findMissingNumber3(int[] arr, int size, int upperRange) {
        HashSet<Integer> st = new HashSet<Integer>();
        int i = 0;
        while (i < size) {
            st.add(arr[i]);
            i += 1;
        }
        i = 1;
        while (i <= upperRange) {
            if (st.contains(i) == false)
                return i;
            i += 1;
        } System.out.println("NoNumberMissing"); return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int size = arr.length;
        int range = 10;
        System.out.println("Missing number is: " + findMissingNumber3(arr, size, range));
    }
}
