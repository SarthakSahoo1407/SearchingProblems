import java.util.Arrays;

public class Q16 {
    public static void minAbsSumPair2(int arr[],int size){
        int l, r, minSum, sum, minFirst, minSecond;
        if (size < 2) {
            System.out.println("Invalid Input"); return;
        }
        Arrays.sort(arr);
        minFirst = 0;
        minSecond = size - 1;
        minSum = Math.abs(arr[minFirst] + arr[minSecond]);
        for (l = 0, r = size - 1; l < r;) {
            sum = (arr[l] + arr[r]);
            if (Math.abs(sum) < minSum) {
                minSum = Math.abs(sum);
                minFirst = l;
                minSecond = r;
            }
            if (sum < 0) {
                l++;
            } else if (sum > 0) {
                r--;
            } else {
                break;
            }
        }
        System.out.println(" Minimum sum pair : " + arr[minFirst] + " , " +
                arr[minSecond]);

    }
    //driver code
    public static void main(String[] args) {
        int[] arr = { 1, 60, -10, 70, -80, 85 };
        int n = arr.length;
        minAbsSumPair2(arr, n);
    }
}
