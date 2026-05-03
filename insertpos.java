import java.util.Scanner;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int pos = -1;
        while (s <= e) {
            int m = s+(e-s) / 2;
            if (nums[m] == target) {
                pos = m;
                break;
            } else if (nums[m] > target) {
                e = m - 1;
                pos = m;
            } else {
                pos = m + 2;
                s = m + 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.searchInsert(nums, target);
        System.out.println("Position to insert: " + result);
    }
}
