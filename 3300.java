class Solution {
    public int minElement(int[] nums) {
        int min=nums[0];
       
        for(int i=0;i<nums.length;i++){
         int sum=0;
            while(nums[i]!=0){
                int rem=nums[i]%10;
                sum=sum+rem;
                nums[i]/=10;

            }
            
            min=Math.min(min,sum);
        }

        return min;
    }
}
