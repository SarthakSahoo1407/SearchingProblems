public class Q62 {
    public static boolean FindElementIn2DArray(int[] arr[], int r, int c, int value) {
        int row = 0;
        int column = c - 1;
        while (row < r && column >= 0) {
            if (arr[row][column] == value) {
                return true;
            } else if (arr[row][column] > value) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int r = 3;
        int c = 4;
        int value = 7;
        System.out.println(FindElementIn2DArray(arr, r, c, value));
    }
}
