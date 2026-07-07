class Solution {
    public String findCommonResponse(List<List<String>> responses) {
          HashMap<String, Integer> map = new HashMap<>();
String max1="";
int max=Integer.MIN_VALUE;
for (List<String> inner : responses) {
    HashSet<String> set = new HashSet<>(inner);

    for (String word : set) {
        map.put(word, map.getOrDefault(word, 0) + 1);
    }
}
        
  for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if(entry.getValue()>max){
            max=entry.getValue();
            max1=entry.getKey();
        }
      else if (entry.getValue() == max) {
    if (entry.getKey().compareTo(max1) < 0) {
        max1 = entry.getKey();
    }
}
    
}
     return max1;   
    }
}