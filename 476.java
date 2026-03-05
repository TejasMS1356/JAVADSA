class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        char[] arr = bin.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='1';

            }
            else{
                arr[i]='0';
            }
        }
        String binr = new String(arr);
        int decimal = Integer.parseInt(binr, 2); 
        return decimal;
    }
}
