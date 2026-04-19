class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isi=false;
        boolean isd=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                isd=true;
            }
            else if(nums[i]<nums[i+1])
            {
                isi=true;
            }

        }
        if(isi && isd){
            return false;
        }
        else{
            return true;
        }
        
    }
}
