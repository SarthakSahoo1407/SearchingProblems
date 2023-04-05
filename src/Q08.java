public class Q08 {
    public static int findMissingNumber(int[]arr, int size, int range){
        int i = 0;
        int xorSum = 0;
        for(i = 0; i < size; i++){
            xorSum ^= arr[i];
        }
        for(i = 1; i <= range; i++){
            xorSum ^= i;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int size = arr.length;
        int range = 10;
        System.out.println("Missing number is: " + findMissingNumber(arr, size, range));
    }
}
