class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr=new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
int k=0;
for(int i=0;i<nums.length;i++){
    if( map.get(nums[i])!=null && map.get(nums[i])==2){
        arr[k++]=nums[i];
map.remove(nums[i]);
    }
}
return arr;
    }
}