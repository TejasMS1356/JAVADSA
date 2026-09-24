class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stac=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!stac.isEmpty() && stac.peek()<nums2[i]){
                map.put(stac.pop(),nums2[i]);
                
            }
            stac.push(nums2[i]);
        }
        for(int i:stac){
            map.put(i,-1);
        }
for(int i=0;i<nums1.length;i++){
    res[i]=map.get(nums1[i]);
}

    return res;    

        
    }
}