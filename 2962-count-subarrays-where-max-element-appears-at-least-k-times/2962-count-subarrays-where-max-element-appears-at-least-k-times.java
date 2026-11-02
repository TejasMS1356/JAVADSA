class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = nums[0];

for(int i = 1; i < nums.length; i++){
    if(nums[i] > max){
        max = nums[i];
    }
}
int high=0;
int low=0;
long count=0;
int maxc=0;
for(high=0;high<nums.length;high++){
if(nums[high]==max){
    maxc+=1;
}
while(maxc>=k){
    if(nums[low]==max){
        maxc--;
    }
    low++;
}
count+=low;  
}
     return count;
    }
}