class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int h=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for( h=0;h<fruits.length;h++){
            
           map.put(fruits[h], map.getOrDefault(fruits[h], 0) + 1);
           while(map.size()>2){
            
            map.put(fruits[l], map.get(fruits[l]) - 1);

                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
           }
           res=Math.max(res,h-l+1);

        }
        return res;
    }
}