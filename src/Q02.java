public class Q02 {
    public static void  printRepeating(int arr[], int size){
        int i,j;
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,6,7,8,9,10,11,12,13,14,15,15};
        int size=arr.length;
        printRepeating(arr,size);
    }
}
