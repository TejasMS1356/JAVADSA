class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int right=0;
        int left=0;
        int sum=0;

        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        res[0]=sum-nums[0];
        res[nums.length-1]=sum-nums[nums.length-1];
        right=sum-nums[0];
        for(int i=0;i<nums.length-1;i++){
            left=left+nums[i];
            right=right-nums[i+1];
            res[i+1]=Math.abs(left-right);




        }
        return res;
    }
}