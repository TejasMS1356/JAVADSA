import java.util.Arrays;
import java.util.Scanner;

public class cielling{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements: ");
        int n1=in.nextInt();
        int[] arr=new int[n1];
        for(int j=0;j<n1;j++){
            arr[j]=in.nextInt();
        }
        System.out.print("enter the target no: ");
        int tar=in.nextInt();
       
        int b=0;
        int ans=0;
        int e=arr.length-1;
        while(b<=e){
            int m=(b+e)/2;

            if(arr[m]==tar){
                ans=arr[m];
                break;
            }

            else if(arr[m]>tar){
                e=m-1;
                ans=arr[m];
             }
             else{
                b=m+1;
                
                
             }
        }
       System.out.println(ans);

       
    }
}