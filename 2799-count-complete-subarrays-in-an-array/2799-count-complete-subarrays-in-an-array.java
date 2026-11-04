class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int nd=map.size();
          HashMap<Integer,Integer> maps=new HashMap<>();
          int high=0;
          int low=0;
          int count=0;
          for(high=0;high<nums.length;high++){
            maps.put(nums[high],maps.getOrDefault(nums[high],0)+1);
            while(maps.size()==nd){
                maps.put(nums[low], maps.get(nums[low]) - 1);

            if (maps.get(nums[low]) == 0) {
                maps.remove(nums[low]);
            }
low++;

            }
count+=low;
          }

        return count;
    }
}