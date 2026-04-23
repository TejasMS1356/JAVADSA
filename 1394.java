class Solution {
    public int findLucky(int[] arr) {
        
        int maxc=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
            
            if(arr[i]==arr[j]){
                count+=1;
                
                }
                }
                if(count>maxc && count==arr[i]){
                    maxc=count;
            }
            }
        return maxc;
        
    }
}
