class Solution {
    public int search(int[] nums, int target) {
        int res=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                res=m;
                break;

            }else if(nums[s]<=nums[m]){
         if(nums[m]>=target && nums[s]<=target){
               e=m-1;

            }
            else{
                s=m+1;
            }
            }
            else if(nums[m]<=target && target<=nums[e]){
                s=m+1;
            }
            else{
                e=m-1;
            }

        }
        return res;
    }
}
