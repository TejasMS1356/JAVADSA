import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,7};
        for(int i=0;i<arr.length;){
            if(arr[i]-1!=i){
               int temp=arr[i];
                 arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
            else{
                i++;
                System.out.println(arr[i]);
            }

        }
                    System.out.println(Arrays.toString(arr));

    }

}
   