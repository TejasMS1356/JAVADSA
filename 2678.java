class Solution {
    public int countSeniors(String[] details) {
        int count=0;

        for(int i=0;i<details.length;i++){
            String word=details[i];  
            char one=word.charAt(11);
            char two=word.charAt(12);
            int first=one-'0';
            int sec=two-'0';
            int num=first*10+sec;
            if(num>60){
                count++;

            }




        }
        return count;

        
    }
}
