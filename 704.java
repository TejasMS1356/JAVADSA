class Solution {
    public int search(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int res=bin(nums,s,e,target);
        return res;
        
    }
    static int bin(int[] nums,int s,int e,int target){
        if(s>e){
            return -1;
        }
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
               

            }
            else if(nums[m]<target){
                return bin(nums,m+1,e,target);
            }
           
                return bin(nums,s,m-1,target);
            
           
        }
}
