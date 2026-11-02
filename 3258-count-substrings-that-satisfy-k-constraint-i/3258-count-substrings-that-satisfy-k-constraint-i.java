class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int low=0;
        int high=0;
        int count0=0;
        int count1=0;
        int count=0;
        for(high=0;high<s.length();high++){
            
            char ch=s.charAt(high);
            if(ch=='0'){
                count0+=1;
            }
            else{
                count1+=1;
            }
            while(count1>k && count0>k){
                if(s.charAt(low)=='0'){
                    count0--;
                }
                else{
                    count1--;
                }
                low++;
            }

    count+=high-low+1;

        }
        return count;
    }
}