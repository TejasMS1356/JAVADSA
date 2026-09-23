class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            int no=nums1[i];
            for(int j=0;j<nums2.length;j++){
                
                if(nums2[j]==no ){
                    int found=0;
                    for(int l=j+1;l<nums2.length;l++){

                    if(nums2[l]>nums2[j]){
                        arr[k++]=nums2[l];
                        found=1;
                        break;

                    }
                   
                }
                if(found==0){
                        arr[k++]=-1;
                }

                }
                

            }
        }
        return arr;
    }
}