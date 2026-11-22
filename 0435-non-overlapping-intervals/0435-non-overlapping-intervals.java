class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         int n=intervals.length;
         int count=0;
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];

            if(end1>start2){
count++;
 end1=Math.min(end1,end2);

            }
            else{
                end1=end2;
            }
        }
        return count;
    }
}