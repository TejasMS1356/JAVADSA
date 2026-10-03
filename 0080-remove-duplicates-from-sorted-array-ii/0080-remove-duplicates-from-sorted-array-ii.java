
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=2;
        int count=2;
        while(j<nums.length){
            if(nums[j]!=nums[i-1]){
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