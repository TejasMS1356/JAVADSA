import java.util.Scanner;


public class linearsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the no; ");
        int n1=in.nextInt();
        int[] arr=new int[n1];
        for(int j=0;j<n1;j++){
            arr[j]=in.nextInt();
        }
        System.out.print("enter the target no: ");
        int tar=in.nextInt();

        
        System.out.println("the "+tar+"is present in "+min(arr,tar));
    }
    static int min(int[] arr,int tar){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;

    }
}
