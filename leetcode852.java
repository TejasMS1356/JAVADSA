//peakindexmountainarray
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int b = 0;
        int ans=0;

        int e = arr.length - 1;
        while (b < e) {
            int m = b+(e-b) / 2;
            if(arr[m]>arr[m+1]){
                e = m;
                
            }
            else {
            b = m+1;
            }
        }


    return b;

        
    }

    
}
