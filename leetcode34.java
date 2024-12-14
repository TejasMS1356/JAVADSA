class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] fin=new int[2];
        int ans1 = bin(nums, target);
        int ans2=left(nums, target);
        fin[0] = ans1;
        fin[1] = ans2;
       
        return fin;
    }
         static int bin(int[] nums, int target) {
        int x=-1;


        int b = 0;

        int e = nums.length - 1;
        while (b <= e) {
            int m = b + (e - b) / 2;
            if (nums[m] == target) {
                x= m;
                e=m-1;

            }


           else if (nums[m] > target) {
                e = m - 1;


            } else if (nums[m] < target) {
                b = m + 1;

            } else{
                x=-1;
                }//potential answer is found


        }
        return x;
    }
     static int left(int[] nums, int target) {
        int y=-1;


        int b = 0;

        int e = nums.length - 1;
        while (b <= e) {
            int m = b + (e - b) / 2;
            if (nums[m] == target) {
                y = m;
                b = m + 1;

            }


           else if (nums[m] > target) {
                e = m - 1;


            } else if (nums[m] < target) {
                b = m + 1;

            } 
            //potential answer is found
        }
        return y;
    }
        
    }
    
   
    

