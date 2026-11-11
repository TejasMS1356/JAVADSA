class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int best=nums[0];
        int res = Math.abs(nums[0]);
        int minn=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=best+nums[i];
            
            best=Math.max(v1,v2);
           minn = Math.min(nums[i], minn + nums[i]);

            res=Math.max(res,Math.max(Math.abs(best),Math.abs(minn)));

        }
        return res;
    }
}