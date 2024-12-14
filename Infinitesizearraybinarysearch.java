import java.util.Scanner;

public class infinite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int b=0;
    int e=1;


       int[] arr={1,2,3,4,5,6,7,8,9,10,12,13,14};

        int tar = 2;
        int an = ans(arr, tar);
        System.out.println(an);
    }
    static int ans(int[] arr,int tar){
        //to find the range(start and end) where the target is present
      
        int b=0;
        int e=1;
        //target is always greater than end element
        while(tar>arr[e]){
            int ns=e+1;
            e=e+(e-b+1)*2;//doubling the size of the array
            b=ns;//new begging

        }
        return bin(arr,tar,b,e);

    }

    static int bin(int[] arr, int tar,int b,int e) {
        //normal binarysearch
   while (b <= e) {
            int m = b+(e-b) / 2;

if(tar==arr[m]){
    return m;
}

           else if (arr[m] > tar) {
                e=m-1;


            } //tential answer is found
            else {
                b=m+1;

            }
        }
        return -1;
    }
    }

