import java.util.Arrays;
import java.util.Scanner;

public class linearsearch2d {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of rows: ");
        int n1=in.nextInt();
        System.out.println("enter the no of cols: ");
        int n2=in.nextInt();
          
        int arr[][]=new int[n1][n2];

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=in.nextInt();
            }
        }

        int tar=in.nextInt();
        int[] ans=sea(arr,tar);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sea(int[][] arr,int tar){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==tar)
                return new int[]{r,c};
            }
        }
   return new int[]{-1,-1};

    }

}
