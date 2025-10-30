class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0,e=numbers.length-1;
     int[] array=new int[2];
            while(s<e){
               
                if(numbers[e]+numbers[s]==target){
                    array[0]=s+1;
                    array[1]=e+1;
                    break;
                }
                else if(numbers[e]+numbers[s]<target){
                    s++;
                }
                else{
                    e--;
                }
            }  
return array;  
    }
}
