class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxend = nums[0];
        int minend = nums[0];
        int res = nums[0];
        int minres = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = nums[i] + maxend;
            int v3 = nums[i] + minend;

            maxend = Math.max(v1, v2);
            minend = Math.min(v1, v3);

            res = Math.max(res, maxend);
            minres = Math.min(minres, minend);
        }

        if (res < 0) {
            return res;
        }

        return Math.max(res, sum - minres);
    }
}