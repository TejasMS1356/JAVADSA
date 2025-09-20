public class binaryusingrecur {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        int tar=8;
        int ans=search(arr,tar,0,arr.length-1);
        System.out.println(ans);
        
    }
    static int search(int[] arr,int tar,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==tar){
            return m;
            
        }
        if(arr[m]<tar){
            return search(arr,tar,m+1,e);
        }
        return search(arr,tar,s,m-1);

     
        
    }
}
