public class Q47 {
    public static int SearchBotinicArrayMax(int[] arr, int size) {
        int start = 0, end = size - 1;
        int mid = (start + end) / 2;
        int maximaFound = 0;
        if (size < 3) {
            System.out.println("error");
            return 0;
        }
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid])// maxima
            {
                maximaFound = 1;
                break;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {// increasing {
                start = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {// decreasing {
                end = mid - 1;
            } else {
                break;
            }
        }
        if (maximaFound == 0) {
            System.out.println("error");
            return 0;
        }
        return arr[mid];
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 1, 3, 2, 1 };
        int n = arr.length;
        System.out.println(SearchBotinicArrayMax(arr, n));
    }
}
