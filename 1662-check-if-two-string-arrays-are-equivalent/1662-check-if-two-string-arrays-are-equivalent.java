class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String no1="";
        String no2="";
        for(int i=0;i<word1.length;i++){
            no1+=word1[i];
        }
          for(int i=0;i<word2.length;i++){
            no2+=word2[i];
        }

        if(no1.equals(no2)){
            return true;
        }
        return false;
    }
}