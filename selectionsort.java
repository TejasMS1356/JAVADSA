import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
           int[] arr={3,1,5,4,2};
           selection(arr);
           System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find max eleemnt in the remainng and swap it with correct index
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);

        
        }
    }
     static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp; 
    }
    static int getmax(int[] arr,int start,int last){
        int ma=start;
          for(int i=0;i<last;i++){
            if(arr[i]>arr[ma]){
                ma=i;
            }
          }
          return ma;

    }
   
    
}
