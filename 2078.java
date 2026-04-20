class Solution {
    public int maxDistance(int[] colors) {
        int res=0;
        int max=0;
        int i=0;
        int j=colors.length-1;
            for(i=0;i<colors.length;i++){
                for(j=0;j<colors.length;j++){
            
            
            if(colors[i]!=colors[j]){
                res=Math.abs(j-i);
                if(res>max){
 max=res;

                }
            }
                }
        }
        return max;
        
    }
}
