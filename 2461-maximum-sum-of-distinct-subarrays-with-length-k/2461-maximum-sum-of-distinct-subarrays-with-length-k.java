class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int h = k - 1;
        long sum = 0;
        long max = 0;

  
        for (int i = l; i <= h; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }

        if (map.size() == k) {
            max = sum;
        }

 
        while (h < nums.length - 1) {

            map.put(nums[l], map.get(nums[l]) - 1);

            if (map.get(nums[l]) == 0) {
                map.remove(nums[l]);
            }

            sum -= nums[l];

            l++;
            h++;

       
            map.put(nums[h], map.getOrDefault(nums[h], 0) + 1);
            sum += nums[h];

            
            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}