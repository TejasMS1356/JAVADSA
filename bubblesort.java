import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        //run the steps n-1
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
}
