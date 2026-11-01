class Solution {
    public String minWindow(String s, String t) {
        int low=0;
        int high=0;
        int count=0;
        int start=0;
         int min = Integer.MAX_VALUE;
        int[] map=new int[128];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map[ch]++;
        }
        for(high=0;high<s.length();high++){
                        char ch=s.charAt(high);

            if(map[ch]>0){
                count++;

            }
        
            map[ch]--;
            while(count==t.length()){
                int len=high-low+1;
                if(len<min){
                    min=len;
                start=low;
                    
                }
                char remove=s.charAt(low);
                map[remove]++;
                if(map[remove]>0){
                    count--;
                }
                low++;
            }
        }
            if (min == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + min);

        
        
    }
}