class Solution {
    public int numberOfSubstrings(String s) {
        int low=0;
        int high=0;
        int res=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                                count += s.length() - high;

                char c=s.charAt(low);
                 map.put(c, map.get(c) - 1);
                 if (map.get(c) == 0) {
                    map.remove(c);
                }
                 low++;
            }
            
          
        }
        return count;
    }
}