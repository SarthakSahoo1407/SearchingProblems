import java.util.HashSet;

public class Q11 {
    public static void missingValue(int arr[],int size) {
        HashSet<Integer> ht = new HashSet<Integer>();
        int minVal = 999999;
        int maxVal = -999999;
        for (int i = 0; i < size; i++) {
            ht.add(arr[i]);
            if (minVal > arr[i])
                minVal = arr[i];
            if (maxVal < arr[i])
                maxVal = arr[i];
        }
        for (int i = minVal; i < maxVal + 1; i++) {
            if (ht.contains(i) == false) {
                System.out.println(i);
            }
        }
    }

        //driver code
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
            int size = arr.length;
            missingValue(arr, size);
        }

    }
