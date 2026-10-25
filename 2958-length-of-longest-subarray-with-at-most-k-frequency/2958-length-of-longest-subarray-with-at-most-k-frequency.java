class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l=0;
        int h=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(h=0;h<nums.length;h++){
            map.put(nums[h],map.getOrDefault(nums[h],0)+1);
            while(map.get(nums[h])>k){
                 map.put(nums[l], map.get(nums[l]) - 1);
                 if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                 l++;

            }
            int len=h-l+1;
             max=Math.max(max,len);
        }
        return max;
    }
}