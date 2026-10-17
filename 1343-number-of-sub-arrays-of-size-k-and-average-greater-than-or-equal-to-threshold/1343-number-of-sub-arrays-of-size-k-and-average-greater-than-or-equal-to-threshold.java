class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low=0;
        int high=k-1;
        int sum=0;
        int count=0;
        int avg=0;
      for(int i=low;i<=high;i++){
        sum=sum+arr[i];
      }
        while(high<arr.length){
            avg=sum/k;
            if(avg>=threshold){
                count++;
            }
            low++;
            high++;
            if(high==arr.length){
                break;
            }
            sum=sum-arr[low-1];
            sum=sum+arr[high];



        }
        return count;
        
    }
}