class Solution {
    public int minimumCardPickup(int[] cards) {
       HashMap<Integer, Integer> map = new HashMap<>();
int ans = -1;
int max=Integer.MAX_VALUE;
for (int i = 0; i < cards.length; i++) {

    if (!map.containsKey(cards[i])) {
        map.put(cards[i], i);
    }

            else{
                ans=(i+1)-map.get(cards[i]);
max=Math.min(ans,max);
map.put(cards[i],i);

            }
        }
      if (max == Integer.MAX_VALUE) {
            return -1;
        }
        return max;
    }
}