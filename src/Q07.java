public class Q07 {
    public static int findMissingNumber(int arr[], int size){
        int i, j, found = 0;
        for (i = 1; i <= size; i++) {
            found = 0;
            for (j = 0; j < size; j++) {
                if (arr[j] == i) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    //driver code
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,10,11,12,13,14,15};
        int size=arr.length;
        System.out.println(findMissingNumber(arr,size));
    }

}
