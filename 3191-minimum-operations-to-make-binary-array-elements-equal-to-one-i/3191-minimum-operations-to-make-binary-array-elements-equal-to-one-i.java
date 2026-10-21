class Solution {
    public int minOperations(int[] nums) {
        int l = 0;
        int count = 0;
        int r=2;

        while (r < nums.length) {

            if (nums[l] == 0) {
                nums[l] = 1 - nums[l];
                nums[l + 1] = 1 - nums[l + 1];
                nums[l + 2] = 1 - nums[l + 2];

                count++;
            }

            l++;
            r++;
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return -1;
            }
        }

        return count;
    }
}