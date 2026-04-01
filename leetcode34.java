class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int a=left(nums,target,s,e);
        int b=right( nums, target, s,e);
        return new int[]{a, b};

        
    }
    static int left(int[] nums,int target,int s,int e){
        int r=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                r=m;
                e=m-1;

            }
           else if(target<nums[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return r;
       
    }
    static int right(int[] nums,int target,int s,int e){
        int r=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                r=m;
                s=m+1;

            }
           else if(target<nums[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return r;
       
    }

}
