import java.util.Scanner;
public class searchinrange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter the no of elements: ");
        int n1=in.nextInt();
        int[] arr=new int[n1];
       for(int j=0;j<n1;j++){
        arr[j]=in.nextInt();
       }
        int tar=in.nextInt();
        System.out.println(search(arr,tar,1,4)); 
        

    }
    static int search(int[] arr,int tar,int a,int b){
        for(int i=a;i<=b;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;

    }

}
