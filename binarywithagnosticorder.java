import java.util.Scanner;
public class binarywithagnosticorder{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the no of elements in the array: ");
        int n1=in.nextInt();
        int arr[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("enter the target element:  ");
        int tar=in.nextInt();
        
            int ans=bin(arr,tar);
    
    System.out.println(ans);
        

        
    }
    static int bin(int[] arr,int tar){
        int s=0;
        int e=arr.length-1;
        while(s<=e)  {
        int  m=(e+s)/2;
        if(arr[m]==tar){
            return m;
        }
        if(arr[0]>arr[arr.length-1]){
             if(arr[m]<tar){
                s=m+1;
            }
                else{
                    e=m-1;
    
                }
        }
            else {
                if(arr[m]<tar){
                    e=m-1;
                }
                    else{
                        e=m+1;
        
                    }
            }
        }
        return -1;
    }
}

