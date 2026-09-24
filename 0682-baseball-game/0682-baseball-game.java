class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stac=new Stack<>();
        for (int i=0;i<operations.length;i++) {
            String no=operations[i];
            
             if(no.equals("+")){
                int sum=stac.peek()+stac.get(stac.size() - 2);
                stac.push(sum);
            }
           else if(no.equals("D")){
            stac.push(2*stac.peek());
           }
           else if(no.equals("C")){
            stac.pop();
           }
           else{
            int num = Integer.parseInt(no);
                stac.push(num);

           }
        }
        int sum=0;

for(int i : stac) {
   sum+=i;
}
return sum;
        
    }
}