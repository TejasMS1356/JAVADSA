class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countl=0;
        int countr=0;
        int count=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                countl++;
            }
            else if(moves.charAt(i)=='R'){
                countr++;
            }
            else{
                count++;
            }
           
           
        }
        int dis=Math.abs(countl-countr)+count;
        return dis;
        
    }
}
