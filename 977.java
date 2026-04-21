class Solution {
    public int[] sortedSquares(int[] nums) {
        int  i=0;
        int j=nums.length-1;
        int[] r = new int[nums.length];
        for(int k=nums.length-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                r[k]=nums[i]*nums[i];
                i++;
            }
            else{
                r[k]=nums[j]*nums[j];
                j--;
            }
        }
        return r;
        
    }
}
