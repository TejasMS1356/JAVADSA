class Solution {
    public int[] sortedSquares(int[] nums) {
        int st=nums.length;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                st=i;
                break;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        int i=0;
        int j=st-1;

        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            i++;
            j--;
        }

        nums=mergesort(Arrays.copyOfRange(nums,0,st),
                       Arrays.copyOfRange(nums,st,nums.length),
                       nums);

        return nums;
    }

    public int[] mergesort(int[] left,int[] right,int[] nums){
        int i=0;
        int j=0;
        int k=0;
        int n=left.length;
        int m=right.length;

        while(i<n && j<m){
            if(left[i]<=right[j]){
                nums[k++]=left[i++];
            }
            else{
                nums[k++]=right[j++];
            }
        }

        while(i<n){
            nums[k++]=left[i++];
        }

        while(j<m){
            nums[k++]=right[j++];
        }

        return nums;
    }
}