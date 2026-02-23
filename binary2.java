public class binary2{
    public static void main(String[] args) {
        int arr[]={2,3,4,2,3};
        System.out.println(uni(arr));

    }
    static int uni(int[] arr){
        int unique=0;
        for(int a:arr){
            unique^=a;
            
        }
        return unique;
    }
}