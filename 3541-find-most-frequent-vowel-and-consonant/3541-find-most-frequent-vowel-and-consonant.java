class Solution {
    public int maxFreqSum(String s) {
        int vof=0;
        int cof=0;
        int max=0;

HashMap<Character, Integer> map = new HashMap<>();

for(char ch : s.toCharArray()) {
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}        
for(char ch:map.keySet()){
    if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
        if(map.get(ch)>vof){
            vof=map.get(ch);
        }
    }
    else{
        if(map.get(ch)>cof){
            cof=map.get(ch);
        }

    }
}
     return vof+cof;   
    }
}