public class Q05 {
    public static void printRepeating(int arr[], int size, int range){
        int i;
        int count[] = new int[range];
        System.out.print("Repeating Elements: ");
        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1) {
                System.out.print(arr[i]+" ");
            }else{
                count[arr[i]]++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,6,7,8,9,10,11,12,13,14,15,15};
        int size=arr.length;
        int range=16;
        printRepeating(arr,size,range);
    }
}
