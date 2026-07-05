class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
        int i=0;
        int k=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[k++]=nums[i];
            }
        }
        for( int l=0;l<nums.length;l++){
            if(nums[l]==pivot){
                arr[k++]=nums[l];
            }
        }
        for( int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                arr[k++]=nums[j];
            }
        }
        return arr;
    }
}