class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
         }
         for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(map.get(nums[j])>map.get(nums[j+1])){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                else if(map.get(nums[j])==map.get(nums[j+1])){
                    if(nums[j]<nums[j+1]){
                        int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    }

                }
            }
         }
         return nums;
        
    }
}
