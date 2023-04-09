import java.util.Arrays;

public class Q23 {
    public static int MinDiffPair(int arr1[], int size1, int arr2[], int size2) {
        int minDiff = 9999999;
        int first = 0;
        int second = 0;
        int out1 = 0, out2 = 0, diff;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (first < size1 && second < size2) { diff = Math.abs(arr1[first] - arr2[second]); if (minDiff > diff) {
            minDiff = diff;
            out1 = arr1[first];
            out2 = arr2[second];
        }
            if (arr1[first] < arr2[second])
                first += 1;
            else
                second += 1;
        }
        System.out.println("The pair is :: " + out1 + out2); System.out.println("Minimum difference is :: " + minDiff); return minDiff;
    }
    //driver code
public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        MinDiffPair(arr1, n1, arr2, n2);
    }
}
