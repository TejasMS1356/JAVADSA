class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum=nums[i]+sum;
            int sum1=0;
            while(nums[i]!=0){
                int rem=nums[i]%10;
                sum1=rem+sum1;
                nums[i]/=10;

            }
            sum2+=sum1;


        }
        return Math.abs(sum2-sum);
        
    }
}
