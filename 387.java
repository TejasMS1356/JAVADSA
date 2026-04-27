class Solution {
    public int firstUniqChar(String s) {
        int res=-1;
        
        
        for(int i=0;i<s.length();i++){
               boolean isUnique = true;
            for(int j=0;j<s.length();j++){
             
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    isUnique=false;
                    break;
                    


                }
               

            
        }
        if(isUnique){
return i;
        
        }
        }
            
            return -1;
        

}
}
