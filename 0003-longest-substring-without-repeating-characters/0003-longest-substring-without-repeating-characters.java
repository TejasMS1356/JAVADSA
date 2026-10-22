class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int h=0;
        int l=0;
        int max=0;
        for(h=0;h<s.length();h++){
            char ch=s.charAt(h);
             map.put(ch, map.getOrDefault(ch, 0) + 1);
             int k=h-l+1;
             while(map.size()<k){
                char c=s.charAt(l);
                 map.put(c, map.get(c) - 1);
                 if (map.get(c) == 0) {
                    map.remove(c);
                }
                 l++;
                 k=h-l+1;
             }
             max=Math.max(max,h-l+1);
        }
        return max;
    }
}