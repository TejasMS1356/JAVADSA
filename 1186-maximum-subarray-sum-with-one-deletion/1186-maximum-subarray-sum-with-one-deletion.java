class Solution {
    public int maximumSum(int[] arr) {
        int nodel=arr[0];
        int onedel=Integer.MIN_VALUE;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevno=nodel;
            int prevone=onedel;
            nodel=Math.max(arr[i],prevno+arr[i]);
onedel = prevno;
            if (prevone != Integer.MIN_VALUE) {
                onedel = Math.max(onedel, prevone + arr[i]);
            }
            res=Math.max(res,Math.max(nodel,onedel));
        }
        return res;
        
    }
}