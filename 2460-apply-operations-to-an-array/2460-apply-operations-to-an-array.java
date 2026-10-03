class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0;
        int j=1;
        int k=0;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                nums[j-1]=2*nums[j-1];
                
                nums[j]=0;
                j++;
            }
            else{
                j++;
            }
        }
        int[] arr=new int[nums.length];
        for(int g=0;g<nums.length;g++ ){
            if(nums[g]!=0){
                arr[k++]=nums[g];
            }
           
        }
        return arr;
    }
}