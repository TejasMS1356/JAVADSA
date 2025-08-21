import java.util.Arrays;

public class findingno{
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        int i=0;
       int  n=arr.length;
        while (i<arr.length) {
            int correctindex=arr[i]-1;   
            if( arr[i]!=arr[correctindex]){
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }
            else{
                i++;
            }
 }
        int[] a=res(arr,n);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arr));
     }
     public static int[] res(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return new int[]{i+1,i+2};
            }
    }
                   return new int[]{};

  
}
}