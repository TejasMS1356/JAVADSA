class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int count=1;
        while(j<nums.length){
            if(nums[j]!=nums[j-1]){
                count++;
                ++i;
                nums[i]=nums[j];
                j++;
                
            
            }
            else{
                j++;
            }
            
        }
        return count;
    }
}