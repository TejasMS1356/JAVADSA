class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }
         HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int h=2;
        int count=0;
    for(int i=l;i<=h;i++){
        char ch=s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
        
    }
    if(map.size()==3){
            count++;
        }
    while(h<s.length()-1){
        char c=s.charAt(l);
        map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }

            l++;
            h++;

            char ch = s.charAt(h);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() == 3) {
                count++;
            }
        }

        return count;

    
    }
}