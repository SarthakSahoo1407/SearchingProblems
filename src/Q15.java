public class Q15 {
    public static void minAbsSumPair(int[] arr, int size){
        int l, r, minSum, sum, minFirst, minSecond;
        if (size < 2) {
            System.out.println("Invalid Input");
            return;
        }
        minFirst = 0;
        minSecond = 1;
        minSum = Math.abs(arr[0] + arr[1]);
        for (l = 0; l < size - 1; l++) {
            for (r = l + 1; r < size; r++) {
                sum = Math.abs(arr[l] + arr[r]);
                if (sum < minSum) {
                    minSum = sum;
                    minFirst = l;
                    minSecond = r;
                }
            }
        }
        System.out.println(" Minimum sum elements are : " + arr[minFirst] + " , " +
                arr[minSecond]);
    }
    //driver code
    public static void main(String[] args) {
        int[] arr = { 1, 60, -10, 70, -80, 85 };
        int n = arr.length;
        minAbsSumPair(arr, n);
    }
}
