import java.util.Scanner;


public class mininarray{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the no; ");
        int n1=in.nextInt();
        int[] arr=new int[n1];
        for(int j=0;j<n1;j++){
            arr[j]=in.nextInt();
        }
        
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int s=arr[0];
        int mi=s;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<s){
                mi=s;
            }
        }
        return mi;

    }
}
