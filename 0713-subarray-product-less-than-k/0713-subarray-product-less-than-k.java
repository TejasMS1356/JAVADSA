class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int h=0;
        int count=0;
        int pro=1;
      if(k <= 1) {
    return 0;
}
        for(h=0;h<nums.length;h++){
            pro=pro*nums[h];
            while(pro>=k){
                pro=pro/nums[l];
                l++;

            }
           count += h - l + 1;
        



        }
        return count;
        
    }
}