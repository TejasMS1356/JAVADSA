class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(target>nums[i]){
                count++;
            }
           else if(target==nums[i]){
                count1++;
            }
        }
        for(int j=count;j<=count+count1-1;j++){
            numbers.add(j);
        }
return numbers;
        
    }
}
