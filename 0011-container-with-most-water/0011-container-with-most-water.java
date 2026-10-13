class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int cur = Math.min(height[l], height[r]) * (r - l);

            if(cur>max){
                max=cur;
            }
            if(height[r]<height[l]){
                r--;
            }
            else{
                l++;
            }

        }
        return max;
    }
}