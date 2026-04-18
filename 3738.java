class Solution {
    public int mirrorDistance(int n) {
        int as=n;
        int an=0;
        while(n>0){

            int rem=n%10;
            an=an*10+rem;
            n/=10;

        }
    if(as>an){
        return as-an;
    }
    else{
        return an-as;
    }

        
    }
}
