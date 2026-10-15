class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int j=0;
        int i=0;
        int k=0;
        double ans=0;
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                arr[k++]=nums1[i];
                i++;
            }
            else{
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i<n){
            arr[k++]=nums1[i++];
        }

        while(j<m){
            arr[k++]=nums2[j++];
        }
        if(arr.length%2!=0){
            ans=arr[arr.length/2];
        }
        else{
             ans = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }
        return ans;
    }
}