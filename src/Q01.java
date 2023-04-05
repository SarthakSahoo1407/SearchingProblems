public class Q01 {
    public static int firstRepeated(int arr[],int size){
        int i,j;
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,15};
        int size=arr.length;
        System.out.println(firstRepeated(arr,size));
    }
}
