
public class missingno{
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int i=0;
       int  n=10;
        while (i<arr.length) {
            int correctindex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctindex]){
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }
            else{
                i++;
            }
 }
        int a=res(arr,n);
        System.out.println(a);
     }
     public static int res(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
    }
    return n;
}
}