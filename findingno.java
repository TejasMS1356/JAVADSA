class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci]){
                swap(nums,i,ci);
                

            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int ind=0;ind<nums.length;ind++){
            if(nums[ind]!=ind+1){
                ans.add(ind+1);
            }
        }
        return ans;
        
    }
   void swap(int[] nums,int i,int ci){
        int temp=nums[i];
        nums[i]=nums[ci];
        nums[ci]=temp;
    }
}
